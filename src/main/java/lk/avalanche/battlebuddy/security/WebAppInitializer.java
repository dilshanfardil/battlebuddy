package lk.avalanche.battlebuddy.security;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{WebRootConfig.class, WebSecurityConfig.class};
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebAppConfig.class};
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
