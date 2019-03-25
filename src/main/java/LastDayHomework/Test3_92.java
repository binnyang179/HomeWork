package LastDayHomework;

import java.io.IOException;

public class Test3_92 {
    public static void main(String[] args) {
        StudentInfos studentInfos = new StudentInfos();
        try {
            studentInfos.readStudents("temp.txt");
            studentInfos.showStudent();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}


