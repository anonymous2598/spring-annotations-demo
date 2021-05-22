package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BeanLifecycleDemoBean  implements DisposableBean, InitializingBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("just before destroying");
    }
    @PostConstruct
    public void customInit()
    {
        System.out.println("Method @PostConstruct customInit() invoked...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("just after propertiesSet");

    }
    @PreDestroy
    public void customDestroy()
    {
        System.out.println("Method @PreDestroy customDestroy() invoked...");
    }
}
