package com.kcc.soo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.util.UrlPathHelper;

@ComponentScan("com.kcc.soo.web")
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

  // 기본 ViewResolver 대체할 때
  @Bean
  public ViewResolver viewResolver() {
    InternalResourceViewResolver vr = new InternalResourceViewResolver("/WEB-INF/jsp/", ".jsp");
    return vr;
  }

  @Override
  public void configurePathMatch(PathMatchConfigurer configurer) {
    UrlPathHelper helper = new UrlPathHelper();
    helper.setRemoveSemicolonContent(false);
    configurer.setUrlPathHelper(helper);
  }

}
