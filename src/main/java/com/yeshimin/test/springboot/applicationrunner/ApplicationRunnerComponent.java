package com.yeshimin.test.springboot.applicationrunner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * ApplicationRunner test
 *
 * @author yeshimin
 * @since 2017-09-13
 */
@Component
public class ApplicationRunnerComponent implements ApplicationRunner {

    private static final Logger logger = LoggerFactory.getLogger(ApplicationRunnerComponent.class);

    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.info("ApplicationRunnerComponent.run(), args: {}", Arrays.toString(args.getSourceArgs()));
    }
}
