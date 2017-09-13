package com.yeshimin.test.springboot.accessapplicationarguments;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * @author yeshimin
 * @since 2017-09-13
 */
@RestController
@RequestMapping("applicationarguments")
public class ApplicationArgumentsTestController {

    private static final Logger logger = LoggerFactory.getLogger(ApplicationArgumentsTestController.class);

    @Autowired
    private ApplicationArguments applicationArguments;

    @GetMapping("test")
    public Object test() {
        logger.info("ApplicationArgumentsTestController.test()");

        StringBuffer sbResult = new StringBuffer();
        sbResult.append(Arrays.toString(applicationArguments.getSourceArgs()));
        sbResult.append("\n");
        sbResult.append(Arrays.toString(applicationArguments.getNonOptionArgs().toArray()));
        sbResult.append("\n");
        sbResult.append(Arrays.toString(applicationArguments.getOptionNames().toArray()));
        return sbResult.toString();
    }
}
