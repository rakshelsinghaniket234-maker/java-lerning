import java.util.ArrayList;

class HomeWork {
    int sid;
    String name;
    String enroll;
    int p, c, m, h, e;
    int total;
    float per;
    String grade;

    void calculateResult() {
        total = p + c + m + h + e;
        per = total / 5.0f;

        if (per >= 90)
            grade = "A+";
        else if (per >= 75)
            grade = "A";
        else if (per >= 60)
            grade = "B";
        else if (per >= 40)
            grade = "C";
        else
            grade = "Fail";
    }

    void display() {
        System.out.println("id: " + sid);
        System.out.println("name: " + name);
        System.out.println("enroll: " + enroll);
        System.out.println("total: " + total);
        System.out.println("percentage: " + per);
        System.out.println("grade: " + grade);
        System.out.println("    ");
    }
}

public class MainApp {
    public static void main(String[] args) {

        // ye  ArrayList hai
        ArrayList<HomeWork> list = new ArrayList<HomeWork>();

        // Object hai ye
        HomeWork sc = new HomeWork();
        sc.sid = 1;
        sc.name = "Aniket";
        sc.enroll = "cs132";
        sc.p = 65;
        sc.c = 75;
        sc.m = 55;
        sc.h = 85;
        sc.e = 88;

        sc.calculateResult();

        // CRUD haii
        list.add(sc);              // Create haii
        list.get(0).display();     // Read ahii

        list.get(0).name = "Vishal"; // update  hai
        list.get(0).enroll = "cs13271";
        list.get(0).calculateResult();
        list.get(0).display();

        list.remove(0);            //  ye to Delete hai
        System.out.println("total Students = " + list.size());
    }
}