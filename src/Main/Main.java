package Main;

import ClassFolder.Circle;
import ClassFolder.Cylinder;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Circle-----------------------");
        Circle circle = new Circle(0);
        Circle circle1 = new Circle(12);

        System.out.println("Circle: " + circle);
        System.out.println("Circle1: " + circle1);
        System.out.println("Circle 1 Area: " + circle1.getArea());

        System.out.println("Cylinder-----------------------");
        Cylinder cylinder1 = new Cylinder(0,0);
        System.out.println("Cylinder1: " + cylinder1);

        Cylinder cylinder2 = new Cylinder(10,23);
        System.out.println("Cylinder2 Area: " + cylinder2.getArea());
        System.out.println("Cylinder2 Volume: " + cylinder2.getVolume());


    }
}