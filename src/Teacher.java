public class Teacher {
    String name;
    String branch;
    String mobilePhoneNumber;


    Teacher(String name, String branch, String mobilePhoneNumber) {
        this.name = name;
        this.mobilePhoneNumber = mobilePhoneNumber;
        this.branch = branch;
    }

    void print() {
        System.out.println("Adı : " + this.name);
        System.out.println("Telefonu : " + this.mobilePhoneNumber);
        System.out.println("Bölümü : " + this.branch);

    }
}
