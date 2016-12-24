package com.implemica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Base routing
 *
 * @author malex
 */
@Controller
public class AppBaseController {

    /**
     * The path to the index page
     *
     * @return the home page 'index.jsp'
     */
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String index_GET() {
        return "index";
    }

    /**
     * Login
     */
    @RequestMapping(path = "/login", method = RequestMethod.GET)
    public String login_GET() {
        return "index";
    }

    /**
     * Logout
     */
    @RequestMapping(path = "/logout", method = RequestMethod.GET)
    public String logout_GET() {
        return "index";
    }

    /**
     * Home
     */
    @RequestMapping(path = "/home", method = RequestMethod.GET)
    public String home_GET() {
        return "index";
    }


}
