package LastDayHomework;

import java.awt.dnd.DropTarget;

public class SafeStack implements StackInterface {

    private int top = 0;

    private int[] values = new int[200];

    private boolean dataAvailble = false;

    @Override
    public void push(int n) {
        synchronized (this) {
            while (dataAvailble) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            values[top] = n;
            System.out.println("input number" + n + "done 1 ");
            top++;
            dataAvailble = true;
            notifyAll();
            System.out.println("input number done");
        }
    }

    @Override
    public int[] pop() {
        synchronized (this) {
            while (!dataAvailble) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Pop");
            top--;
            int[] test = {values[top], top};
            dataAvailble = false;
            notifyAll();
            return test;
        }

    }


}
