package src.exe13;

class ThreadEx20 {
    public static void main(String[] args) {
        ThreadEx20_1 gc = new ThreadEx20_1();
        gc.setDaemon(true);
        gc.start();

        int requireMemory = 0;
        for (int i = 0; i < 50; i++) {
            requireMemory = (int) (Math.random() * 10) * 20;

            /**
             * 실행결과를 보면 메모리 수치가 예상과 다르게 나오는 것을 볼 수 있다. 이것은 쓰레드 gc가 수행되기 이전에 main 쓰레드의 작업이 수행되어
             * 메모리를 사용하기 때문이다. 그래서 쓰레드 gc를 깨우는 것뿐만 아니라 join() 을 이용하여 쓰레드 gc가 작업할 시간을 어느정도 주고 main 쓰레드가
             * 기다리도록해서, 사용할 수 있는 메모리가 확보된 다음에 작업을 계속 하는 것이 필요하다.
             */
            if (gc.freeMemory() < requireMemory || gc.freeMemory() < gc.totalMemory() * 0.4) {
                gc.interrupt();
            }

            gc.usedMemory += requireMemory;
            System.out.println("usedMemory = " + gc.usedMemory);
        }
    }
}

class ThreadEx20_1 extends Thread {
    final static int MAX_MEMORY = 1000;
    int usedMemory = 0;

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(10 * 1000);
            } catch (InterruptedException e) {
                System.out.println("Awaken by interrupt().");
            }

            gc();
            System.out.println("Garbage Collected. Free Memory: " + freeMemory());
        }
    }

    public void gc() {
        usedMemory -= 300;
        if (usedMemory < 0) {
            usedMemory = 0;
        }
    }

    public int totalMemory() {
        return MAX_MEMORY;
    }

    public int freeMemory() {
        return MAX_MEMORY - usedMemory;
    }
}


