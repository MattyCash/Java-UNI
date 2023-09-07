import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Make a choice: ");
        System.out.println("1.Schedule");
        System.out.println("2.GPA");

        Student student1 = new Student();
        student1.setInfo("Olzhabek", "Adil", "SIS-2129", "30783");
        Student student2 = new Student();
        student2.setInfo("Saidalimov", "Ilkham", "SIS-2129", "30793");
        Student student3 = new Student();
        student3.setInfo("Mask", "Elon", "SIS-2117", "30710");
        Student student4 = new Student();
        student4.setInfo("Aliyev", "Ali", "SIS-2117", "30777");
        Student student5 = new Student();
        student5.setInfo("Daragliev", "Diyass", "SIS-2129", "30800");
        Student student6 = new Student();
        student6.setInfo("Clifton", "Cassado", "SIS-2117", "30609");

        University uni1 = new University();
        uni1.setGrade(75, 78, 93);
        University uni2 = new University();
        uni2.setGrade(50, 90, 76);
        University uni3 = new University();
        uni3.setGrade(100, 100, 100);
        University uni4 = new University();
        uni4.setGrade(75, 78, 83);
        University uni5 = new University();
        uni5.setGrade(64, 51, 65);
        University uni6 = new University();
        uni6.setGrade(49, 35, 0);

        Schedule s1 = new Schedule();
        s1.setSubject("Math", "903");
        Schedule s2 = new Schedule();
        s2.setSubject("Physics", "405");
        Schedule s3 = new Schedule();
        s3.setSubject("Java", "702");
        Schedule s4 = new Schedule();
        s4.setSubject("CISCO", "707");
        Schedule s5 = new Schedule();
        s5.setSubject("Linux", "online");
        Schedule s6 = new Schedule();
        s6.setSubject(" ", " ");

        while (true) {

            System.out.println("Enter your choice");
            int choice = s.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Choose your group:");
                    System.out.println("1.SIS-2117");
                    System.out.println("2.SIS-2129");
                    int s_choice = s.nextInt();
                    if (s_choice == 1) {
                        System.out.println("MONDAY");
                        s1.print1();
                        s1.print1();
                        s6.print1();
                        s5.print1();
                        s5.print1();
                        s5.print1();
                        System.out.println('\n');
                        System.out.println("TUESDAY");
                        s2.print1();
                        s2.print1();
                        s2.print1();
                        s6.print1();
                        s6.print1();
                        s6.print1();
                        System.out.println('\n');
                        System.out.println("SATURDAY");
                        s3.print1();
                        s3.print1();
                        s3.print1();
                        s6.print1();
                        s6.print1();
                        s1.print1();
                        System.out.println('\n');
                        System.out.println("WEDNESDAY");
                        s6.print1();
                        s6.print1();
                        s6.print1();
                        s6.print1();
                        s6.print1();
                        s6.print1();
                        System.out.println('\n');
                        System.out.println("FRIDAY");
                        s6.print1();
                        s6.print1();
                        s4.print1();
                        s4.print1();
                        s4.print1();
                        s6.print1();
                        System.out.println('\n');
                    } else if (s_choice == 2) {
                        System.out.println("MONDAY");
                        s5.print1();
                        s5.print1();
                        s6.print1();
                        s6.print1();
                        s1.print1();
                        s1.print1();
                        System.out.println('\n');
                        System.out.println("TUESDAY");
                        s6.print1();
                        s6.print1();
                        s6.print1();
                        s2.print1();
                        s2.print1();
                        s2.print1();
                        System.out.println('\n');
                        System.out.println("SATURDAY");
                        s1.print1();
                        s1.print1();
                        s6.print1();
                        s3.print1();
                        s3.print1();
                        s3.print1();
                        System.out.println('\n');
                        System.out.println("WEDNESDAY");
                        s6.print1();
                        s6.print1();
                        s6.print1();
                        s6.print1();
                        s6.print1();
                        s6.print1();
                        System.out.println('\n');
                        System.out.println("FRIDAY");
                        s4.print1();
                        s4.print1();
                        s6.print1();
                        s6.print1();
                        s6.print1();
                        s4.print1();
                        System.out.println('\n');
                    }
                case 2:
                    System.out.println("Choose your group:");
                    System.out.println("1.SIS-2117");
                    System.out.println("2.SIS-2129");
                    int t_choice = s.nextInt();
                    if(t_choice == 1){
                        student3.print();
                        student4.print();
                        student6.print();
                        int t1_choice = s.nextInt();
                        if(t1_choice == 1){
                            uni3.count();
                        }
                        else if(t1_choice == 2){
                            uni4.count();
                        }
                        else if(t1_choice == 3){
                            uni6.count();
                        }
                    }
                    else if(t_choice == 2){
                        student1.print();
                        student2.print();
                        student5.print();
                        int t2_choice = s.nextInt();
                        if(t2_choice == 1){
                            uni1.count();
                        }
                        else if(t2_choice == 2){
                            uni2.count();
                        }
                        else if(t2_choice == 3){
                            uni5.count();
                        }
                    }
            }
        }
    }
}





class Student{
   private String surname;
   private String name;
   private String group;
   private String id;

    void setInfo(String surname, String name, String group, String id){
        this.surname = surname;
        this.name = name;
        this.group = group;
        this.id = id;
    }
    void print(){
        for(int i = 0; i<1;i++){
            System.out.println("*" + " " + surname + " " + name + " " + group + " " + id + " ");
        }
    }
}



class Schedule{
    String s1;
    String room;

    void setSubject(String s1, String room) {
        this.s1 = s1;
        this.room = room;
    }

    void print1() {
        for (int i = 0; i < 1; i++) {
            System.out.println("*" + s1 + " " + room );
        }
    }
}

    class University {
        double mT1;
        double mT2;
        double fE = 0;

        void setGrade(double mT1, double mT2, double fE) {
            this.mT1 = mT1;
            this.mT2 = mT2;
            this.fE = fE;
        }
        void count(){
            double dopusk;
            double gpa1 = 0;
            dopusk = (mT1 + mT2) / 2;
            if(dopusk < 50){
                System.out.println("You don't have enough points to pass the exam. RETAKE!!! Your GPA without Final Exam: " + dopusk);
            }
            else if(dopusk >= 50){
                System.out.println("Congratulations! you have passed the final exam. Your GPA without Final Exam: " + dopusk);
                gpa1 = (mT1 + mT2 + fE)/3;
                System.out.println("Your GPA with Final Exam: " + gpa1);
            }
        }
        /*
        void gpa1(){
            double gpa1 = 0;
            gpa1 = (mT1 + mT2 + fE)/3;
            System.out.println("Your GPA with Final Exam: " + gpa1);
        }
        */
    }


