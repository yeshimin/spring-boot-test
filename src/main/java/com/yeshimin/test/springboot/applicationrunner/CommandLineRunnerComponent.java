package com.yeshimin.test.springboot.applicationrunner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * CommandLineRunner test
 *
 * @author yeshimin
 * @since 2017-09-13
 */
@Component
public class CommandLineRunnerComponent implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(CommandLineRunnerComponent.class);

    @Override
    public void run(String... args) {
        logger.info("CommandLineRunnerComponent.run(), args: {}", Arrays.toString(args));
    }
}
