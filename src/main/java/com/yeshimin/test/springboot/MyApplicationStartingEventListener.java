package com.yeshimin.test.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.stereotype.Component;

/**
 * @author yeshimin
 * @since 2017-08-22
 */
@Component
public class MyApplicationStartingEventListener implements ApplicationListener<ContextStartedEvent> {

    private static final Logger logger = LoggerFactory.getLogger(MyApplicationStartingEventListener.class);

    @Override
    public void onApplicationEvent(ContextStartedEvent contextStartedEvent) {
        logger.info("onApplicationEvent()");
    }
}
