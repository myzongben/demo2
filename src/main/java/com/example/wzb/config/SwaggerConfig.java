package com.example.wzb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 *  @author: wangzongben
 *  @Date: 2020/11/20 11:27
 *  @Description:集成swagger UI的配置类
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    //固定写法，方法名api自定义
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                //括号里加载的是下面创建的apiInfo方法
                .apiInfo(apiInfo())
                //配置整个的访问路径，这里为根路径
                .pathMapping("/")
                //选择上前面的目录，根路径
                .select()
                //路径选择器，正则配置server下的方法，选择根目录下的所有方法
                .paths(PathSelectors.regex("/.*"))
                //build下该文件
                .build();
    }

    private ApiInfo apiInfo(){
        //swagger界面标题，联系人（含姓名，链接，邮箱），描述，版本，最后build这个文件
        return new ApiInfoBuilder().title("项目接口列表")
                .contact(new Contact("wangzongben","https://github.com/myzongben/demo2","myzongben@126.com"))
                .description("这是swaggerui生成的接口文档")
                .version("1.0.0.0")
                .build();

    }
}
