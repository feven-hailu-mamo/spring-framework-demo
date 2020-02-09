package com.springdemo.beanfactory;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Traingle implements Shape,InitializingBean, DisposableBean {
    private String type;
    private Point pointA;
    private Point pointB;
    private Point pointC;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Point getPointA() {
        return pointA;
    }

    @Required
    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    @Autowired
    @Qualifier("another-point")
    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    @Override
    public void draw() {
        System.out.println("DRAWING TRIANGLE");
        System.out.println(getType() + " Drawing triangle" +
                "with points " + getPointA());
        System.out.println(getType() + " Drawing triangle" +
                "with points " + getPointB());
        System.out.println(getType() + " Drawing triangle" +
                "with points " + getPointC());
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Triangle bean has been initialized");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Desposable beans destroy method is called");
    }
}
