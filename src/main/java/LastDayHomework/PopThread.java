package LastDayHomework;

import org.graalvm.compiler.core.phases.EconomyHighTier;

public class PopThread implements Runnable {

    private StackInterface stackInterface;

    public PopThread(StackInterface stackInterface) {
        this.stackInterface = stackInterface;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("->" + stackInterface.pop()[0] + "<-");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
