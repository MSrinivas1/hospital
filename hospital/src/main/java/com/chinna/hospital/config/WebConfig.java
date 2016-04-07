package com.chinna.hospital.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.chinna.hospital")
public class WebConfig extends WebMvcConfigurerAdapter {

	
    @Override
    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/font/**").addResourceLocations("/font/");
        registry.addResourceHandler("/ui/css/**").addResourceLocations("/ui/css/");
        registry.addResourceHandler("/ui/img/**").addResourceLocations("/ui/img/");
        registry.addResourceHandler("/ui/js/**").addResourceLocations("/ui/js/");
        registry.addResourceHandler("/ui/template/**").addResourceLocations("/ui/template/");
        
        registry.addResourceHandler("/*").addResourceLocations("/");
        super.addResourceHandlers(registry);
    }
	
    @Bean
    public InternalResourceViewResolver jspViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setOrder(1);
        resolver.setPrefix("/WEB-INF/jsp/");
        resolver.setSuffix(".jsp");
        resolver.setRedirectHttp10Compatible(false);
        resolver.setViewClass(JstlView.class);
        return resolver;
    }  
}
