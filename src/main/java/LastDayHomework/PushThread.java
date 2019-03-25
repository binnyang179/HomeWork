package LastDayHomework;

public class PushThread implements Runnable {
    private StackInterface stackInterface;

    public PushThread(StackInterface stackInterface) {
        this.stackInterface = stackInterface;
    }
    @Override
    public void run() {
        int i = 0;

        while (true) {
            java.util.Random r = new java.util.Random();
            i = r.nextInt(10);
            stackInterface.push(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


