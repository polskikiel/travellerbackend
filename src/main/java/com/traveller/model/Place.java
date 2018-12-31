package com.traveller.model;

import java.util.List;

public class Place {
    private Point place;
    private List<Point> points;

    public Place() {
    }

    public Place(Point place, List<Point> points) {
        this.place = place;
        this.points = points;
    }

    public Point getPlace() {
        return place;
    }

    public void setPlace(Point place) {
        this.place = place;
    }

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }
}
