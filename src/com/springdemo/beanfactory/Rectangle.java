package com.springdemo.beanfactory;

public class Rectangle implements Shape{

    private Point point1;
    private Point point2;

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    @Override
    public void draw() {
        System.out.println(" Drawing rectangle " +
                "with points " + getPoint1());
        System.out.println(" Drawing rectangle " +
                "with points " + getPoint2());
    }

    public void myInit(){
        System.out.println("My init method called for Rectangle");
    }
    public void myDestroy(){
        System.out.println("My destroy method called for Rectangle");
    }

}
