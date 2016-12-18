package com.implemica.initializer;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * @author malex
 */
public class ApplicationInitializer implements WebApplicationInitializer {

    /**
     * Servlet config
     */
    private final static String DISPATCHER = "dispatcher";
    private final static String MAPPING_URL = "/";
    private final static String CONFIG_LOCATION = "com.implemica.config";

    /**
     * MultipartConfigElement
     */
    private final static long MAX_FILE_SIZE = 2000000;
    private final static long MAX_REQUEST_SIZE = 10000000;
    private final static int FILE_SIZE_THRESHOLD =0;


    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

        // WebApplicationContext
        WebApplicationContext context = getContext();

        // Added ContextLoaderListener
        ContextLoaderListener loaderListener = new ContextLoaderListener(context);
        servletContext.addListener(loaderListener);

        //Create DispatcherServlet
        DispatcherServlet dispatcherServlet = new DispatcherServlet(context);

        //  ServletRegistration
        ServletRegistration.Dynamic servletRegistration = servletContext.addServlet(DISPATCHER, dispatcherServlet);
        servletRegistration.addMapping(MAPPING_URL);
        servletRegistration.setLoadOnStartup(1);
        servletRegistration.setMultipartConfig(getMultiPartConfigElement());
    }

    private AnnotationConfigWebApplicationContext getContext() {
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.setConfigLocation(CONFIG_LOCATION);
        return ctx;
    }

    private MultipartConfigElement getMultiPartConfigElement() {
        return new MultipartConfigElement("", MAX_FILE_SIZE, MAX_REQUEST_SIZE, FILE_SIZE_THRESHOLD);
    }
}
