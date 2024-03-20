package src.exe12;

import java.util.ArrayList;

class exe12_1 {

    static class Fruit {
    }

    static class Apple extends Fruit {

    }

    static class Grape extends Fruit {
    }


    static class Box<T extends Fruit> {

        T item;


        public T getItem() {
            return item;
        }

        public void setItem(T item) {
            this.item = item;
        }
    }





}




