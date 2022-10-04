package com.epam.spring.homework2.factory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class PostProcessorFactoryBean implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("In PostProcessorFactoryBean");
        System.out.println("Original BeanB initMethod name = "
                + configurableListableBeanFactory.getBeanDefinition("BeanB").getInitMethodName());
        configurableListableBeanFactory.getBeanDefinition("BeanB").setInitMethodName("newInitName");
        System.out.println("New BeanB initMethod name = "
                + configurableListableBeanFactory.getBeanDefinition("BeanB").getInitMethodName());
    }
}
