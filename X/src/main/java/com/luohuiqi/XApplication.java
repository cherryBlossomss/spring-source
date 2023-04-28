package com.luohuiqi;

import com.luohuiqi.service.MessageService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p></p>
 *
 * @author luohuiqi
 * @date : 2023/4/26 11:21
 **/
public class XApplication {
    public static void main(String[] args) {
	   ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:application.xml");
	    MessageService bean = applicationContext.getBean(MessageService.class);
	    System.out.println("Message: " + bean.send(1918065258));
    }
}
