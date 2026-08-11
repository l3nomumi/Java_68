package week2;

import java.util.Random;

public class Students {

    private String studentID;
    private String name;
    private String major;

    public static void main(String[] arg) {

        Students student = new Students();

        System.out.println(student.getStudentID("67xxx"));
        System.out.println(student.getFullname("Watcharin", "Sukpasoed"));
        System.out.println(student.getGrade(80f));

        String firstname = "Watcharin";
        String lastname = "Sukpasoed";

        System.out.println("firstname is : " + firstname);
        System.out.println("lastname is : " + lastname);
        System.out.println("(from computer science)");
    }

    public String getStudentID(String studentID) {
        return "This is student ID : " + studentID;
    }

    public String getFullname(String fname, String lname) {
        return "This is fullname : " + fname + " " + lname;
    }

    public String getGrade() {

        Random random = new Random();

        int num = random.nextInt(2); // 0 = คู่, 1 = คี่

        if (num % 2 == 0) {
            return " Grade A (>90)";
        } else {
            return " Grade B (>80)";
        }
    }
}