package com.epam.spring.homework2.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class BeanB {
    private String name;
    private String  value;

    @Autowired
    public BeanB(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public void init(){
        System.out.println("BeanB init method");
    }

    public void destroy(){
        System.out.println("BeanB destroy method");
    }

    @Override
    public String toString() {
        return "BeanB{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
