package org.example;

public class Rectangle implements Polygon {
    public float width;
    public float height;
    private int sides = 4;

    public Rectangle (float width, float height) {
        this.width = width;
        this.height =  height;
    }

    public float getArea () {
        return this.width * this.height;
    }

    public int getSides() {
        return sides;
    }
}
