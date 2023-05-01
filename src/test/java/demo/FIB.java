package demo;

import java.util.ArrayList;
import java.util.List;

public class FIB {
    public static void main(String[] args) throws InterruptedException {
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            Thread cal = new Thread(new CalTask(30));
            cal.start();
            threads.add(cal);
        }
        for (Thread thread : threads) {
            thread.join();
        }
    }
}
