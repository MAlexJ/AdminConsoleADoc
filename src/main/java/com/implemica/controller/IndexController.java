package com.implemica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author malex
 */

@Controller
public class IndexController {

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String index_GET() {
        return "index";
    }

}
