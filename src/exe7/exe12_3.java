package src.exe7;

public class exe12_3 {
    static class Fruit {
    }

    static class Apple extends Fruit {
    }

    static class Box<T extends Fruit> {
        T item;

        public void setItem(T item) {
            this.item = item;
        }
    }

    public static void main(String[] args) {
        Box<?> b1 = new Box();
        Box<?> b2 = new Box<>();
//        Box<?> b3 = new Box<Object>();
//        Box<Object> b4 = new Box<Fruit>();
        Box b5 = new Box<Fruit>();
        Box<? extends Fruit> b6 = new Box<Apple>();
//        Box<? extends Object> b7 = new Box<? extends Fruit>();
    }
}
