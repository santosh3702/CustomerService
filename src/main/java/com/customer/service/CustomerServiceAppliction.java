package com.customer.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.SimpleWsdl11Definition;

@SpringBootApplication
@EnableWs
public class CustomerServiceAppliction extends WsConfigurerAdapter{
	
	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceAppliction.class, args);
	}
	
	@Bean
    public ServletRegistrationBean soapDispatcherServlet(ApplicationContext context) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(context);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean(servlet, "/*");
    }

    @Bean(name = "customerservice")
    public SimpleWsdl11Definition definition1504() {
        SimpleWsdl11Definition def = new SimpleWsdl11Definition();
        def.setWsdl(new ClassPathResource("/wsdl/customerserviceimpl.wsdl"));
        return def;
    }
	

}
