package LastDayHomework;

import com.sun.tools.corba.se.idl.StringGen;

import javax.swing.*;
import javax.swing.plaf.basic.BasicSplitPaneUI;
import java.io.*;
import java.util.*;

public class StudentInfos {
    private Map<String, List<Student>> students = new HashMap<String, List<Student>>();

    public void readStudents(String fileName) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "utf-8"));
        String line = "";
        while ((line = bufferedReader.readLine()) != null) {
            String[] infos = line.split("\\s+");
            System.out.println(Arrays.toString(infos));
            String no = infos[0];
            String name = infos[1];
            String major = infos[2];
            String gender = infos[3];
            String other = infos[4];

            Student student = new Student();
            student.setNo(no);
            student.setName(name);
            student.setGender(gender);
            student.setMajor(major);
            student.setOther(other);
            List<Student> list = null;
            if (students.containsKey(major)) {
                list = students.get(major);
                list.add(student);
            } else {
                list = new ArrayList<Student>();
                list.add(student);
                students.put(major, list);
            }
        }
        bufferedReader.close();
    }
    public void showStudent() {
        Set<String> keys = students.keySet();
        for (String key : keys) {
            System.out.println(key);
            List<Student> list = students.get(key);
            for (Student student : list) {
                System.out.println(student.getNo() + "  " + student.getName() + " " + student.getGender()
                        + " " + student.getOther());
            }
        }
    }
}
