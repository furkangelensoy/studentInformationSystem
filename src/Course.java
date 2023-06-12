public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    double note;
    int firstExam;
    int secondExam;

    Course(String name, String code, String prefix) {

        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;

    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
            printTeacher();
        } else {
            System.out.println("Öğretmen ve Ders Bölümleri Uyuşmuyor.");
        }
    }

    void printTeacher() {
        this.teacher.print();
    }
}
