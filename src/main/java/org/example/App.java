package org.example;

public class App {
    public static void main( String[] args ) {
        int height = 8;
        int width = 4;

        Polygon square = new Square(width);
        Polygon circle = new Circle(width);
        Polygon rectangle = new Rectangle(width, height);

        System.out.println("The area of the square is " + square.getArea() + " and has " + square.getSides() + " sides");
        System.out.println("The area of the circle is " + circle.getArea() + " and has " + circle.getSides() + " sides");
        System.out.println("The area of the rectangle is " + rectangle.getArea() + " and has " + rectangle.getSides() + " sides");
    }
}
