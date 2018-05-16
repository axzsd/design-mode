package com.wl.structure.flyweight.framework;

public class TextExternal {
    private int x;
    private int y;
    private int width;
    private int height;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public TextExternal(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public TextExternal() {
    }

    @Override
    public String toString() {
        return "TextExternal{" +
                "x=" + x +
                ", y=" + y +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
