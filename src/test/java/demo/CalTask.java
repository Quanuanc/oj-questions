package demo;

public class CalTask implements Runnable {
    private final int input;

    public CalTask(int input) {
        this.input = input;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        int result = Util.fib(input);
        System.out.printf("%s cal result: %d\n", name, result);
    }
}
