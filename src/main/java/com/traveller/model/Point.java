package com.traveller.model;

public class Point {
    private double x, y;
    private String description;
    private String img;

    public Point() {
    }

    public Point(double x, double y, String description, String img) {
        this.x = x;
        this.y = y;
        this.description = description;
        this.img = img;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
