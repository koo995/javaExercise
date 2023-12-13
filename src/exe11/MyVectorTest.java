package src.exe11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyVectorTest {

    private MyVector init() {
        MyVector vec = new MyVector();
        vec.add("첫번째");
        vec.add("두번째");
        for (int i = 0; i < 32; i++) {
            vec.add(i + "번째");
        }
        return vec;
    }

    @Test
    void 더하기() {
        MyVector vec = init();
        vec.add("add에서 추가");
        Assertions.assertEquals(35, vec.size());
        Assertions.assertEquals(64, vec.capacity());
    }

    @Test
    void 제거() {
        MyVector vec = init();
        vec.remove("두번째");
        vec.remove("첫번째");
        vec.remove("1번째");
        vec.remove("2번째");
        vec.remove("3번째");
        vec.remove("4번째");
        Assertions.assertEquals(1, vec.indexOf("5번째"));
        Assertions.assertEquals(init().size()-6, vec.size());
    }

    @Test
    void 제거실패() {
        MyVector vec = init();
        vec.remove("두번째");
        vec.remove("첫번째");
        boolean removed2 = vec.remove("1번째");
        boolean removed1 = vec.remove("2번째");
        boolean removed = vec.remove("500번째");
        Assertions.assertSame(true, removed2);
        Assertions.assertSame(true, removed1);
        Assertions.assertSame(false, removed);
    }

    @Test
    void indexOf_찾음() {
        MyVector vec = init();
        Assertions.assertEquals(32, vec.indexOf("30번째"));
        Assertions.assertEquals(22, vec.indexOf("20번째"));
    }

    @Test
    void indexOf_못찾음() {
        MyVector vec = init();
        int idx = vec.indexOf("300번째");
        Assertions.assertSame(-1, idx);

    }

    @Test
    void size() {
        MyVector vec = new MyVector();
        MyVector initVec = init();
        Assertions.assertSame(0, vec.size());
        Assertions.assertSame(34, initVec.size());
    }

    @Test
    void capacity() {
        MyVector vec = new MyVector();
        MyVector initVec = init();
        Assertions.assertSame(16, vec.capacity());
        Assertions.assertSame(64, initVec.capacity());
    }

    @Test
    void isEmpty() {
    }
}