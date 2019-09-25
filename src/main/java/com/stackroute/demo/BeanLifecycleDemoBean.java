package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class BeanLifecycleDemoBean  implements DisposableBean, InitializingBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("just before destroying");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("just after propertiesSet");

    }
}
