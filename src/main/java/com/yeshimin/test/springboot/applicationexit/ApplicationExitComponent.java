package com.yeshimin.test.springboot.applicationexit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.stereotype.Component;

/**
 * @author yeshimin
 * @since 2017-09-13
 */
@Component
public class ApplicationExitComponent implements DisposableBean, ExitCodeGenerator {

    private static final Logger logger = LoggerFactory.getLogger(ApplicationExitComponent.class);

    @Override
    public void destroy() throws Exception {
        logger.info("ApplicationExitComponent.destroy()");
    }

    @Override
    public int getExitCode() {
        logger.info("ApplicationExitComponent.getExitCode()");
        return -1;
    }
}
