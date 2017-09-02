package com.yeshimin.test.springboot.applicationeventlistener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author yeshimin
 * @since 2017-08-22
 */
//@Component
public class MyApplicationStartingEventListener implements ApplicationListener<ApplicationStartingEvent> {

    private static final Logger logger = LoggerFactory.getLogger(MyApplicationStartingEventListener.class);

    @Override
    public void onApplicationEvent(ApplicationStartingEvent event) {
        logger.info("MyApplicationStartingEventListener.onApplicationEvent()");
    }
}
