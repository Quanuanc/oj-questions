package nowcoder.test4;

public class Test1 extends Thread {
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.run();
    }

    public void start() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
