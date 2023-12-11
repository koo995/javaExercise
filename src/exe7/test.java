package src.exe7;

import java.awt.*;

public class test {
    public static void main(String[] args) {
        사람 p1 = new 사람(1, 2);
        사람 p2 = new 사람(3, 6);

        double result1 = p1.getDistance(p2);
        System.out.println("result = " + result1);
        System.out.println("---------------------------");
        double result2 = 사람.getDistance2(p1, p2);
        System.out.println("result2 = " + result2);

        Class<? extends 사람> aClass = p1.getClass();
    }
}

class 사람 {
    int x;
    int y;

    public 사람(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static double getDistance2(사람 사람1, 사람 사람2) {
        return Math.sqrt(Math.pow(사람1.x - 사람2.x, 2) + Math.pow(사람1.y - 사람2.y, 2));
    }

    public double getDistance(사람 다른녀석) {
        return Math.sqrt(Math.pow(this.x - 다른녀석.x, 2) + Math.pow(this.y - 다른녀석.y, 2));
    }
}


