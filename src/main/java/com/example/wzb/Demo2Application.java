package com.example.wzb;

import com.example.wzb.properties.ThreadPoolProperties;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@MapperScan( "com.example.wzb.mapper")
@SpringBootApplication
//@EnableConfigurationProperties({ThreadPoolProperties.class})
public class Demo2Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo2Application.class, args);
    }

}
