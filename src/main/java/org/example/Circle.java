package org.example;

public class Circle implements Polygon {
    public float radius;
    private int sides = 1;

    public Circle (float radius) {
        this.radius = radius;
    }

    public float getArea () {
        return (float) (Math.PI * Math.pow(this.radius, 2));
    }

    public int getSides() {
        return sides;
    }
}
