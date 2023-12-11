package src.exe7.exe7_22;

import java.awt.*;

public abstract class Shape {
    Point point;

    public Shape() {
        this(new Point());
    }

    public Shape(Point point) {
        this.point = point;
    }

    abstract double calcArea();

    public Point getPoint() {
        return point;
    }
}

class Point {
    int x;
    int y;

    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}