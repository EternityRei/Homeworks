package com.epam.spring.homework2.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BeanE {
    private String name;
    private String value;

    @Autowired
    public BeanE(String name, String value) {
        this.name = name;
        this.value = value;
    }

    @PostConstruct
    public void postConstructInit(){
        System.out.println(BeanE.class.getSimpleName() + " postConstructInit()");
    }

    @PreDestroy
    public void preDestroyDest(){
        System.out.println(BeanE.class.getSimpleName() + " preDestroyDest()");
    }

    @Override
    public String toString() {
        return "BeanE{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
