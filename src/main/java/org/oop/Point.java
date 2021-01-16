package org.oop;

import static java.lang.Math.atan2;
import static java.lang.Math.sqrt;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceFrom(Point p) {
        double xDiff = p.x - this.x;
        double yDiff = p.y - this.y;
        return sqrt(square(xDiff) + square(yDiff));
    }

    private double square(double n) {
        return Math.pow(n, 2);
    }

    public double direction(Point p) {
        double yDiff = p.y - this.y;
        double xDiff = p.x - this.x;
        return atan2(yDiff, xDiff);
    }
}
