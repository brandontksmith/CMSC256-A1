package com.btks.a1.q5;

public class Box {
    
    private int height;
    private int length;
    private int width;
    
    public Box() {
        this(0, 0, 0);
    }
    
    public Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    
    public int volume() {
        int volume;
        
        volume = length * width * height;
        
        return volume;
    }
}