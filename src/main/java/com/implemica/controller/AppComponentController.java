package com.implemica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Path to the template for Angular 2
 *
 * @author malex
 */

@Controller
public class AppComponentController {

    /**
     * The path to the ROOT component
     *
     * @return the template 'app.component.jsp'
     */
    @RequestMapping(path = "/app.component", method = RequestMethod.GET)
    public String app_component_GET() {
        return "component/app.component";
    }

    /**
     * The path to the Login page
     */
    @RequestMapping(path = "/app.login", method = RequestMethod.GET)
    public String app_login_GET() {
        return "component/login/app.login";
    }

    /**
     * The path to the Home page
     */
    @RequestMapping(path = "/app.home", method = RequestMethod.GET)
    public String app_home_GET() {
        return "component/home/app.home";
    }

}
