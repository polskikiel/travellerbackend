package com.traveller.model;

import java.util.List;

public class Place {
    private Point data;
    private List<Point> points;

    public Place() {
    }

    public Place(Point data, List<Point> points) {
        this.data = data;
        this.points = points;
    }

    public Point getData() {
        return data;
    }

    public void setData(Point data) {
        this.data = data;
    }

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }
}
