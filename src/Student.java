import java.text.DecimalFormat;

public class Student {
    Course c1;
    Course c2;
    Course c3;

    String name;
    String studentNo;
    String classes;
    double average;
    boolean isPass;


    Student(String name, String studentNo, String classes, Course c1, Course c2, Course c3) {

        this.name = name;
        this.studentNo = studentNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;

    }

    void addfirstExamNote(int exam1, int exam2, int exam3) {
        if (exam1 >= 0 && exam1 <= 100) {
            c1.firstExam = exam1;
        }
        if (exam2 >= 0 && exam2 <= 100) {
            c2.firstExam = exam2;
        }
        if (exam3 >= 0 && exam3 <= 100) {
            c3.firstExam = exam3;
        }
    }

    void addSecondExamNote(int exam1, int exam2, int exam3) {
        if (exam1 >= 0 && exam1 <= 100) {
            c1.secondExam = exam1;
        }
        if (exam2 >= 0 && exam2 <= 100) {
            c2.secondExam = exam2;
        }
        if (exam3 >= 0 && exam3 <= 100) {
            c3.secondExam = exam3;
        }
    }

    void addBulkExamNote() {
        this.c1.note = c1.firstExam * 0.20 + c1.secondExam * 0.80;
        this.c2.note = c2.firstExam * 0.20 + c2.secondExam * 0.80;
        this.c3.note = c3.firstExam * 0.20 + c3.secondExam * 0.80;


    }

    void isPass() {
        System.out.println("======================");
        this.average = (this.c1.note + this.c2.note + this.c3.note) / 3.0;
        if (this.average > 55) {
            System.out.println("Tebrikler sınıfı geçtiniz.");
            this.isPass = true;
        } else {
            System.out.println("Maalesef sınıfta kaldınız.");
            this.isPass = false;
        }
        printNote();
    }

    void printNote() {
        System.out.println(this.c1.name + " Sözlü Notu : " + c1.firstExam
                + "\tYazılı Notu : " + c1.secondExam + "\tDers ortalamanız : " +
                new DecimalFormat("##.##").format(this.c1.note));
        System.out.println(this.c2.name + " Sözlü Notu : " + c2.firstExam
                + "\tYazılı Notu : " + c2.secondExam + "\tDers ortalamanız : "
                + new DecimalFormat("##.##").format(this.c2.note));
        System.out.println(this.c3.name + " Sözlü Notu : " + c3.firstExam +
                "\tYazılı Notu : " + c3.secondExam + "\tDers ortalamanız : "
                + new DecimalFormat("##.##").format(this.c3.note));
        System.out.println("Genel Ortalamanız : " + new DecimalFormat("##.##").format(this.average));
    }
}
