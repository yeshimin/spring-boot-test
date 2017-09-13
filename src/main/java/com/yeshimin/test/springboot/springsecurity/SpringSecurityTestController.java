package com.yeshimin.test.springboot.springsecurity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yeshimin
 * @since 2017-09-02
 */
@RestController
@RequestMapping("springsecurity")
public class SpringSecurityTestController {

    private static final Logger logger = LoggerFactory.getLogger(SpringSecurityTestController.class);

    /**
     * permit all
     */
    @RequestMapping("login")
    public Object login() {
        logger.info("{}.login()", getClass().getSimpleName());

        return "login";
    }

    /**
     * permit all
     */
    @RequestMapping("logout")
    public Object logout() {
        logger.info("{}.logout()", getClass().getSimpleName());

        return "logout";
    }

    /**
     * authenticated (user, admin)
     */
    @RequestMapping("userdo")
    public Object userdo() {
        logger.info("{}.userdo()", getClass().getSimpleName());

        return "userdo";
    }

    /**
     * authenticated (admin)
     */
    @RequestMapping("admindo")
    public Object admindo() {
        logger.info("{}.admindo()", getClass().getSimpleName());

        return "admindo";
    }

    /**
     * authenticated (anyuser)
     */
    @RequestMapping("anyuser")
    public Object anyuser() {
        logger.info("{}.anyuser()", getClass().getSimpleName());

        return "anyuser";
    }
}
