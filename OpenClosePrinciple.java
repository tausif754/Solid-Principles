// This code demonstrates the Open/Closed Principle by defining an interface for shapes

import java.util.Scanner;

interface Shape {
    double area();
}

class Circle implements Shape {
    private double radius;

    // Constructor to accept radius
    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}

class Square implements Shape {
    private double side;

    // Constructor to accept side
    public Square(double side) {
        this.side = side;
    }

    public double area() {
        return side * side;
    }
}

public class OpenClosePrinciple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get radius for Circle
        System.out.print("Enter radius of Circle: ");
        double radius = scanner.nextDouble();
        Shape circle = new Circle(radius);

        // Get side for Square
        System.out.print("Enter side length of Square: ");
        double side = scanner.nextDouble();
        Shape square = new Square(side);

        System.out.println("Area of Circle: " + circle.area());
        System.out.println("Area of Square: " + square.area());

    }
}
