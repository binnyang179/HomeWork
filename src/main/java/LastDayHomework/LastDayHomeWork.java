package LastDayHomework;

import java.io.*;

public class LastDayHomeWork {
    static String sv_MyNameDir = "data/yangbin/";
    static String sv_MyNameFile = "yangbin.txt";

    static String sv_name = "yangbin";
    static String sv_sex = "man";
    static int sv_age = 18;
    static String sv_class = "AI class";


    public static void main(String[] args) {
        mkMyNameDir();
        mkMyNameFile();
        getAttributeOfMyFile();
        storeInfo();
        getStoredInfo();
    }


    public static void mkMyNameDir() {
        File myNameDir = new File(sv_MyNameDir);
        if (!myNameDir.exists()) {
            myNameDir.mkdirs();
        }
    }

    public static void mkMyNameFile() {
        File myNameFile = new File(sv_MyNameDir + sv_MyNameFile);
        if (!myNameFile.exists()) {
            try {
                myNameFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void getAttributeOfMyFile() {
        File myNameFile = new File(sv_MyNameDir + sv_MyNameFile);
        if (myNameFile.canRead()) {
            System.out.println("Can read");
        } else
            System.out.println("Cann't read");

        if (myNameFile.canWrite()) {
            System.out.println("can write");
        } else
            System.out.println("Cann't read");

        if (myNameFile.canExecute()) {
            System.out.println("Cann;t execute");
        } else
            System.out.println("Cann't execute");

        System.out.println(myNameFile.getAbsolutePath());

        System.out.println(myNameFile.getParent());

        System.out.println(myNameFile.length());

        System.out.println(myNameFile.lastModified());
    }

    public static void storeInfo() {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(sv_MyNameDir + sv_MyNameFile));
            bufferedWriter.write("name" + sv_name);
            bufferedWriter.write("sex" + sv_sex);
            bufferedWriter.write("age"+sv_age);
            bufferedWriter.write("class"+sv_class);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getStoredInfo() {
        String line;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(sv_MyNameDir + sv_MyNameFile));
            if ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
