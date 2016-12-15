package com.test.basic.web.init;

import java.io.InputStream;
import java.util.Properties;

import javax.inject.Named;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages={"com.test.basic.web"})
public class BasicWebConfiguration {
	
	
	private static final String APPLICATION_PROPERTIES = "application.properties";

	@Bean
	@Named(APPLICATION_PROPERTIES)
	public Properties getAppProperties(){
		return getPropertyValues(APPLICATION_PROPERTIES);
	}
	
	
	private Properties getPropertyValues(String property){
		  Properties properties = new Properties();
		  InputStream init = null;
		
		  try {
			
			  init = BasicWebConfiguration.class.getClassLoader().getResourceAsStream(property);
			  properties.load(init);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		 
		  return properties;
	}

}
