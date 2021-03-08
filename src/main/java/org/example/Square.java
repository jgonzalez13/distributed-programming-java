package org.example;

public class Square implements Polygon {
    public float width;
    private int sides = 4;

    public Square(int width) {
        this.width = width;
    }

    public float getArea () {
        return (float)(Math.pow(this.width, 2));
    }

    public int getSides() {
        return sides;
    }
}
