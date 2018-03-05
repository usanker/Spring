package com.springProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans_annotationConfig.xml");
      HelloWorld2 obj = (HelloWorld2) context.getBean("helloWorld2");
      obj.getMessage();
      
   }
}