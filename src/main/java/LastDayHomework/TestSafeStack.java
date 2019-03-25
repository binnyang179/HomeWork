package LastDayHomework;

public class TestSafeStack {
    public static void main(String[] args) {
        SafeStack safeStack = new SafeStack();
        PushThread pushThread1 = new PushThread(safeStack);
        PushThread pushThread2 =  new PushThread(safeStack);
        PushThread pushThread3 =  new PushThread(safeStack);
        Thread thread1 = new Thread(pushThread1);
        Thread thread2 = new Thread(pushThread2);
        Thread thread3 = new Thread(pushThread3);
        thread1.start();
        thread2.start();
        thread1.start();
    }
}
