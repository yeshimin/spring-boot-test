package com.yeshimin.test.springboot.accessapplicationarguments;

import com.yeshimin.test.springboot.Application;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

/**
 * @author yeshimin
 * @since 2017-09-13
 */
@Component
public class MyBean {

    private static final Logger logger = LoggerFactory.getLogger(MyBean.class);

    public MyBean(ApplicationArguments applicationArguments) {
        logger.info("source args: {}", applicationArguments.getSourceArgs());
    }
}
