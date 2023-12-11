package src.exe7;

public class exe7_19 {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv());
        b.buy(new Computer());
        b.buy(new Tv());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());

        b.summary();

    }
}

class Buyer {
    int money = 1000;
    Product[] cart = new Product[3];
    int i = 0;

    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액이 부족하여 " + p.toString() + "을 살수 없습니다.");
            return;
        }
        money -= p.price;
        add(p);
    }

    void add(Product p) {
        if (i >= cart.length) {
            Product[] newCart = new Product[cart.length * 2];
            for (int j = 0; j < cart.length; j++) {
                newCart[j] = cart[j];
            }
            cart = newCart;
        }
        cart[i] = p;
        i++;
    }

    void summary() {
        int totalPrice = 0;
        System.out.print("구입한 물건: ");
        for (Product p : cart) {
            totalPrice += p.price;
            System.out.print(p.toString() + ", ");
        }
        System.out.println();
        System.out.println("사용한 금액: " + totalPrice);
        System.out.println("남은 금액: " + money
        );

    }
}

class Computer extends Product {
    Computer() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}

class Audio extends Product {
    Audio(){
        super(50);
    }

    public String toString() {
        return "Audio";
    }
}


