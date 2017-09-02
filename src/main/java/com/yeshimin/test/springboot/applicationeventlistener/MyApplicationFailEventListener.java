package com.yeshimin.test.springboot.applicationeventlistener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author yeshimin
 * @since 2017-09-02
 */
public class MyApplicationFailEventListener
        implements ApplicationListener<ApplicationFailedEvent> {

    private static final Logger logger = LoggerFactory.getLogger(MyApplicationFailEventListener.class);

    @Override
    public void onApplicationEvent(ApplicationFailedEvent event) {
        logger.info("MyApplicationFailEventListener.onApplicationEvent()");
    }
}
