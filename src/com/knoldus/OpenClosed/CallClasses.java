package com.knoldus.OpenClosed;

// calling the classes in main

public class CallClasses {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(42,62);
        int area = r.getArea();
        System.out.println("The area is " + area);

        Circle c = new Circle(82);
        int circumference = c.getArea();
        System.out.println("The area of Circle is " + circumference);

    }
}
