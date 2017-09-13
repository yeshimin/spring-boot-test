package com.yeshimin.test.springboot;

import com.yeshimin.test.springboot.applicationeventlistener.*;
import com.yeshimin.test.springboot.applicationexit.ApplicationExitComponent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@SpringBootApplication
public class Application {

    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    @Autowired
    private ApplicationExitComponent applicationExitComponent;

    @PostConstruct
    public void init() {
        logger.info("Application.init()");
    }

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Application.class);

        application.addListeners(new MyApplicationStartingEventListener());
        application.addListeners(new MyApplicationEnvironmentPreparedEventListener());
        application.addListeners(new MyApplicationPreparedEventListener());
        application.addListeners(new MyApplicationReadyEventListener());
        application.addListeners(new MyApplicationFailEventListener());

        ApplicationContext springApplication = (ApplicationContext)application.run(args);

        application.exit(springApplication);
    }

    @PreDestroy
    public void onDestroy() {
        logger.info("Application.onDestroy()");
    }
}
