package com.implemica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Mapping resources/templates
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
     * The path to the login JSP template
     */
    @RequestMapping(path = "/app.login.html", method = RequestMethod.GET)
    public String app_login_GET() {
        return "component/login/app.login.html";
    }

    /**
     * The path to the login CSS template
     */
    @RequestMapping(path = "/app.login.css", method = RequestMethod.GET)
    public String app_login_css_GET() {
        return "component/login/app.login.css";
    }

    /**
     * The path to the Home page
     */
    @RequestMapping(path = "/app.home", method = RequestMethod.GET)
    public String app_home_GET() {
        return "component/home/app.home";
    }

}
