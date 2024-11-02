package dev.cheng.leetcode.q1114;

// [1114] Print in Order
//leetcode submit region begin(Prohibit modification and deletion)
class Foo {

    private final Object object = new Object();
    private volatile int flag = 1;

    public Foo() {

    }

    public void first(Runnable printFirst) throws InterruptedException {
        synchronized (object) {
            while (flag != 1) object.wait();
            printFirst.run();
            flag = 2;
            object.notifyAll();
        }
    }

    public void second(Runnable printSecond) throws InterruptedException {
        synchronized (object) {
            while (flag != 2) object.wait();
            printSecond.run();
            flag = 3;
            object.notifyAll();
        }
    }

    public void third(Runnable printThird) throws InterruptedException {
        synchronized (object) {
            while (flag != 3) object.wait();
            printThird.run();
            object.notifyAll();
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

