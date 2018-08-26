package com.like.trip;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.github.pagehelper.PageHelper;
import com.like.trip.filter.HTTPBearerAuthorizeAttribute;


@MapperScan("com.like.trip.mapper.**")

@SpringBootApplication
public class MytripApplication {

	public static void main(String[] args) {
		SpringApplication.run(MytripApplication.class, args);
	}
	
	/*
	@Bean
	public FilterRegistrationBean jwtFilterRegistrationBean(){
		FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		HTTPBearerAuthorizeAttribute httpBearerFilter = new HTTPBearerAuthorizeAttribute();
		registrationBean.setFilter(httpBearerFilter);
		List<String> urlPatterns = new ArrayList<String>();
	    urlPatterns.add("/");
	    registrationBean.setUrlPatterns(urlPatterns);
	    return registrationBean;
	}*/
	/**
	 * 创建一个bean
	 * @return
	 */
	/*
	@Bean(name = "sessionFilter")
	public HTTPBearerAuthorizeAttribute sessionFilter() {
	  return new HTTPBearerAuthorizeAttribute();
	}*/
	
}
