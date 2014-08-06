

package com.campitos.spring.web;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


 
public class WebAp extends AbstractAnnotationConfigDispatcherServletInitializer {
    
    @Override
    protected String[] getServletMappings(){
      return new String[]{
          "/servicios/*"
      } ; 
    }
    @Override
    protected Class<?>[] getRootConfigClasses(){
        return new Class<?>[0];
    }
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{WebApConfig.class};
 }
}
