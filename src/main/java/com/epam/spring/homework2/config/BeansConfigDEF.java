package com.epam.spring.homework2.config;

import com.epam.spring.homework2.bean.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.epam.spring.homework2.bean")
public class BeansConfigDEF {
    @Value("${data.bean.name}")
    private String name;

    @Value("${data.bean.value}")
    private String value;

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public BeanD beanD(){
        return new BeanD(name, value);
    }

    @Bean
    public BeanE beanE(){
        return new BeanE(name, value);
    }

    @Bean
    public BeanF beanF(){
        return new BeanF(name, value);
    }
}
