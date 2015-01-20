package com.okpos.push;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hyowon on 2015-01-16.
 */
public class PushApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        PushService pushService = context.getBean(PushService.class);

        pushService.pushMessage();

    }
}
