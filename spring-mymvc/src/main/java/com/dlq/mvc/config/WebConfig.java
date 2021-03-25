package com.dlq.mvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.util.UrlPathHelper;

/**
 *@program: SpringBoot2
 *@description:
 *@author: Hasee
 *@create: 2021-03-23 16:54
 */
@Configuration(proxyBeanMethods = false)
public class WebConfig /*implements WebMvcConfigurer*/ {

	//自定义filter
	@Bean
	public HiddenHttpMethodFilter hiddenHttpMethodFilter() {
		HiddenHttpMethodFilter hiddenHttpMethodFilter = new HiddenHttpMethodFilter();
		hiddenHttpMethodFilter.setMethodParam("_m");
		return hiddenHttpMethodFilter;
	}

	//第一种配置方法
    /*@Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        UrlPathHelper urlPathHelper = new UrlPathHelper();
        // 不移除 ; 后面的内容。矩阵变量功能就可以生效
        urlPathHelper.setRemoveSemicolonContent(false);
        configurer.setUrlPathHelper(urlPathHelper);
    }*/

	//第二种配置方法 ---> 不用实现WebMvcConfigurer接口
	@Bean
	public WebMvcConfigurer webMvcConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void configurePathMatch(PathMatchConfigurer configurer) {
				UrlPathHelper urlPathHelper = new UrlPathHelper();
				// 不移除 ; 后面的内容。矩阵变量功能就可以生效
				urlPathHelper.setRemoveSemicolonContent(false);
				configurer.setUrlPathHelper(urlPathHelper);
			}
		};
	}

}
