package com.epam.spring.homework2.config;

import com.epam.spring.homework2.bean.BeanA;
import com.epam.spring.homework2.bean.BeanB;
import com.epam.spring.homework2.bean.BeanC;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
@ComponentScan(basePackages = "com.epam.spring.homework2.bean")
@Import(BeansConfigDEF.class)
public class BeansConfigABC {
    @Value("${data.bean.name}")
    private String name;

    @Value("${data.bean.value}")
    private String value;

    @Bean()
    public BeanA beanA(){
        return new BeanA(name, value);
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public BeanB beanB(){
        return new BeanB(name, value);
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public BeanC beanC(){
        return new BeanC(name, value);
    }
}
