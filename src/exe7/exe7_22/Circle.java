package src.exe7.exe7_22;

public class Circle extends Shape{

    double r;

    public Circle() {
        super();
    }

    public Circle(Point point, double r) {
        super(point);
        this.r = r;
    }

    @Override
    double calcArea() {
        return 0;
    }
}
