

package com.campitos.spring.web;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@EnableWebMvc
@Configuration
@ComponentScan("com.campitos.spring.web")
public class WebApConfig extends WebMvcConfigurerAdapter {
 //Aqui van mas configuraciones como los interceptores de sesion   
 
}
