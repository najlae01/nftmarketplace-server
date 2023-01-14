package org.fstt.nft.marketplace;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class MvcConfig implements WebMvcConfigurer {
	
	public MvcConfig()
	{
		super();
	}
    	
	@Override
	public void addResourceHandlers(final ResourceHandlerRegistry registry)
	{
		registry.addResourceHandler("/**",
                "/resources/**",
                "/images/**"
               
               )
		        .addResourceLocations(
        		   "classpath:/static/images/",
                   "classpath:/resources/");
	}
}