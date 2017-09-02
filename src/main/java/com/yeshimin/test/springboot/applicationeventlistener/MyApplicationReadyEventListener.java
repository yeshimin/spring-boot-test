package com.yeshimin.test.springboot.applicationeventlistener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author yeshimin
 * @since 2017-09-02
 */
public class MyApplicationReadyEventListener
        implements ApplicationListener<ApplicationReadyEvent> {

    private static final Logger logger = LoggerFactory.getLogger(MyApplicationReadyEventListener.class);

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        logger.info("MyApplicationReadyEventListener.onApplicationEvent()");
    }
}
