package org.inheritance.circlecylinder;

public class Circle {
    private double radius;
    private String color;
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {}
    public String getColor() {
        return color;
    }
    public void setColor(String color) {}
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }
    public String toString() {
        return "something";
    }
}
