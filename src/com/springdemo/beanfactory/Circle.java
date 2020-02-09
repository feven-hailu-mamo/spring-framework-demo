package com.springdemo.beanfactory;

import java.util.List;

public class Circle implements Shape{

    private String type;
    private int radius;
    private List<Point> points;

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public Circle(String type, int radius) {
        this.type = type;
        this.radius = radius;
    }

    public Circle(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public void draw() {
        System.out.println("DRAWING CIRCLE");
        for (Point point : points) {
            System.out.println("Drawing " + getType() + " with radius of " + getRadius()
            + point.toString());
        }
    }
}
