package src.exe7;

public class exe7_5 {
    public static void main(String[] args) {
//        Tv t = new Tv();
    }
}

class Product {
    int price;
    int bonusPoint;

    public Product(int price) {
        this.price = price;
        bonusPoint = (int) (price/10.0);
    }
}

class Tv extends Product {

    Tv(){
        this(100);}

    Tv(int price) {
        super(price);
    }

    public String toString() {
        return "Tv";
    }

}