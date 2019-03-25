package LastDayHomework;

import java.sql.SQLOutput;

public class HomeWork3_25 {
    public static void main(String[] args) {
        Problem3_41();
    }

    public static void Problem3_41() {
        System.out.println("MultiThread are like human body" +
                "it always parallel being many workings," +
                "like breath, blood, food ,thinking," +
                "multiThread can do lots of works");
    }

    public static void Problem3_42() {
        System.out.println("The way to start a thread is S" +
                "start(),but it doesn't mean it can tight away" +
                "run is to product a mark force a thread to stop");
    }

    public static void Problem3_43() {
        System.out.println("sleep is thread's way,this thread will " +
                "stop and give execute chance to others, but at set tie" +
                "it will come back auto, it won't give up object lock" +
                "wait however, is to give up it's object lock,only" +
                " notify method can get object lock and into running condition");
    }

    public static void Problem3_44() {
        System.out.println("yield is only give away his self cpu time," +
                "and into runnable condition, join competation, " +
                "sleep however, will into Blocked condition, when the thing over," +
                "ift will then into runnable condition ");
    }

    public static void Problem3_45() {
        System.out.println("of course not, other threads only can use this object accessible " +
                "method, synchronized method can't");
    }

    public static void Problem3_46() {
        System.out.println("it synchronized key word, there two ways to realize," +
                "one is synchronized method, other one is block,method is static and nonstatic" +
                "it can't be abstracted and interface ,when a thread get this object's synchronized method " +
                "it's other sychronized mehtod is locked ,can't be get,but can get non synchronezed mehtod " +
                "other one is synchronized blocks, locks a object assigned method ,and get all synchronized");
    }

    public static void Problem3_47() {
        System.out.println("synchronized is use when data is shared in threads ,like data is reading by other " +
                "thread ,non is like sms, when a pro is use a lot of time to execute a method .");
    }
}

class Person1 extends Thread {
    @Override
    public void run() {
        System.out.println(this.getName() + "," + this.getId());
        for (int i = 0; i < 20; i++) {
            System.out.println("crack ur windows ");
        }
        System.out.println("bullet out");
    }
}

class Person2 implements Runnable {
    @Override
    public void run() {
        System.out.println(this.getClass() + "," + this.getClass());
        for (int i = 0; i < 20; i++) {
            System.out.println("crack ur windows");
        }
        System.out.println("bullet is over");
    }

}
