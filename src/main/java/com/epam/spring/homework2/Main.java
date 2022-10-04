package com.epam.spring.homework2;

import com.epam.spring.homework2.config.BeansConfigABC;
import com.epam.spring.homework2.processor.PostProcessorBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeansConfigABC.class);
        String[] allBeans = context.getBeanDefinitionNames();
        for(String beanName : allBeans){
            System.out.println(beanName);
        }
    }
}
