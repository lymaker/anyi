package icu.agony.anyi.config;

import cn.dev33.satoken.interceptor.SaAnnotationInterceptor;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.File;

/**
 * @author LiuYun
 * @version 1.0
 */
@SpringBootConfiguration
@RequiredArgsConstructor
public class MvcConfiguration implements WebMvcConfigurer {

    private final AnYiDirectory anYiDirectory;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // sa-token 注解拦截器
        registry.addInterceptor(new SaAnnotationInterceptor()).addPathPatterns("/**");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
            .addResourceHandler("/**")
            .addResourceLocations("file:" + anYiDirectory.getAbsolutePath(AnYiDirectory.Path.APP_WEB) + File.separator);
        registry
            .addResourceHandler("/admin/**")
            .addResourceLocations("classpath:/static/");
    }
}
