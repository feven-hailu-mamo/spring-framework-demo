package com.springdemo.beanfactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
    public static void main(String[] args) {
        /*BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
        Traingle triangle = (Traingle) factory.getBean("triangle");
        triangle.draw();
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
       */
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.registerShutdownHook();
       /* Circle circle = (Circle) context.getBean("circle");
        circle.draw();
        Traingle triangle = (Traingle) context.getBean("triangle-alias");
        triangle.draw();
        Rectangle rectangle = (Rectangle) context.getBean("rectangle");
        rectangle.draw();*/
        Shape shape = (Shape) context.getBean("triangle");
        shape.draw();
        System.out.println(context.getMessage("greeting",null, "Default Greeting",null));
    }
}
