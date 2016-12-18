package com.implemica.initializer;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.*;

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
    private final static int FILE_SIZE_THRESHOLD = 0;

    /**
     * CharacterEncodingFilter
     * Encoding :UTF-8
     */
    private final static String ENCODING_FILTER_NAME = "encoding-filter";
    private final static String ENCODING_UTF = "UTF-8";
    private final static String ENCODING = "encoding";
    private final static String ENCODING_PATH = "/*";


    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

        // WebApplicationContext
        WebApplicationContext context = getContext();

        // Added ContextLoaderListener
        ContextLoaderListener loaderListener = new ContextLoaderListener(context);
        servletContext.addListener(loaderListener);

        //Create DispatcherServlet
        DispatcherServlet dispatcherServlet = new DispatcherServlet(context);

        // Added new Filter CharacterEncodingFilter UTF-8
        FilterRegistration.Dynamic encodingFilter = servletContext.addFilter(ENCODING_FILTER_NAME, new CharacterEncodingFilter());
        encodingFilter.setInitParameter(ENCODING, ENCODING_UTF);
        encodingFilter.setInitParameter("forceEncoding", "true");
        encodingFilter.addMappingForUrlPatterns(null, true, ENCODING_PATH);

        //  ServletRegistration
        ServletRegistration.Dynamic servletRegistration = servletContext.addServlet(DISPATCHER, dispatcherServlet);
        servletRegistration.addMapping(MAPPING_URL);
        servletRegistration.setLoadOnStartup(1);
        servletRegistration.setMultipartConfig(getMultiPartConfigElement());
    }

    /**
     * Initialize AnnotationConfigWebApplicationContext
     *
     * @return the spring app context
     */
    private AnnotationConfigWebApplicationContext getContext() {
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.setConfigLocation(CONFIG_LOCATION);
        return ctx;
    }

    /**
     * The method using to configure download or upload files
     *
     * @return MultipartConfigElement
     */
    private MultipartConfigElement getMultiPartConfigElement() {
        return new MultipartConfigElement("", MAX_FILE_SIZE, MAX_REQUEST_SIZE, FILE_SIZE_THRESHOLD);
    }
}
