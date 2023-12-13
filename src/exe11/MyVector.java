package src.exe11;

import java.util.Arrays;

public class MyVector {

    private int capacity;
    private int size;
    private Object[] objArr;

    public MyVector() {
        this(16);
    }

    public MyVector(int capacity) {
        this.capacity = capacity;
        objArr = new Object[this.capacity]; // 이 부분 주의하자.
    }

    public int size() {
        return size;
    }

    public int capacity() {
        return capacity;
    }

    // 객체(obj)를 objArr에 추가하는 메서드
    public void add(Object obj) {
        // 1. 저장공간이 있는지 확인 현재 가득차 있다면
        if (size() >= capacity()) {
            // 2. 없으면 공간 늘린다.
            capacity = capacity * 2;
            Object[] newObjArr = new Object[capacity];
            for (int i=0; i < size(); i++) {
                newObjArr[i] = objArr[i];
            }
            objArr = newObjArr;
        }
        // 3.저장
        objArr[size++] = obj;
    }


    public Object get(int index) {
        return objArr[index];
    }

    public int indexOf(Object obj) {
        for (int i = 0; i < size(); i++) {
            if (objArr[i].equals(obj)) {
                return i;
            }
        }
        return -1;
    }

    public boolean remove(Object obj) {
        // 먼저 객체가 존재하는지 확인
        int idx = indexOf(obj);
        if (idx != -1) {
            System.arraycopy(objArr, idx +1, objArr, idx, size()-idx-1);
            size--;
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public String toString() {
        return "MyVector{" +
                Arrays.toString(objArr) +
                '}';
    }
}
