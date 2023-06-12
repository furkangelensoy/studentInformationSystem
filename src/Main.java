public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Felix Dahn", "TRH", "+49");
        Teacher t2 = new Teacher("Isaac Newton", "FZK", "+44");
        Teacher t3 = new Teacher("Gregor Mendel", "BIO", "+61");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);

        Course biyoloji = new Course("Biyoloji", "101", "BIO");
        biyoloji.addTeacher(t3);


        Student s1 = new Student("Student 1", "159", "4", tarih, fizik, biyoloji);
        s1.addfirstExamNote(90, 0, 75);
        s1.addSecondExamNote(20, -10, 50);
        s1.addBulkExamNote();
        s1.isPass();

        Student s2 = new Student("Student 2", "157", "4", tarih, fizik, biyoloji);
        s2.addfirstExamNote(80, 50, 65);
        s2.addSecondExamNote(81, 82, 93);
        s2.addBulkExamNote();
        s2.isPass();

    }
}