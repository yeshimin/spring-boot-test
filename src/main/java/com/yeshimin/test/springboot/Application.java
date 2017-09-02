package com.yeshimin.test.springboot;

import com.yeshimin.test.springboot.applicationeventlistener.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Application.class);

//        application.addListeners(new MyApplicationStartingEventListener());
        application.addListeners(new MyApplicationEnvironmentPreparedEventListener());
        application.addListeners(new MyApplicationPreparedEventListener());
        application.addListeners(new MyApplicationReadyEventListener());
        application.addListeners(new MyApplicationFailEventListener());

        application.run(args);
    }
}
