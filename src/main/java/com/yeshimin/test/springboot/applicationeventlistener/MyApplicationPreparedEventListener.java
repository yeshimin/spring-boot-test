package com.yeshimin.test.springboot.applicationeventlistener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author yeshimin
 * @since 2017-09-02
 */
public class MyApplicationPreparedEventListener
        implements ApplicationListener<ApplicationPreparedEvent> {

    private static final Logger logger = LoggerFactory.getLogger(MyApplicationPreparedEventListener.class);

    @Override
    public void onApplicationEvent(ApplicationPreparedEvent event) {
        logger.info("MyApplicationPreparedEventListener.onApplicationEvent()");
    }
}
