package com.jumbotech.configure;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
@ComponentScan("com.jumbotech")
@EnableWebMvc
public class JumboTechApi extends WebMvcConfigurerAdapter{
   
}
