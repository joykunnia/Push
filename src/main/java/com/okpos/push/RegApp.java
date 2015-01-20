package com.okpos.push;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hyowon on 2015-01-19.
 */
public class RegApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        RegService regService = context.getBean(RegService.class);

        regService.getGson();

    }
}
