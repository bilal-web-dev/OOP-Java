public class Main {
    public static void main(String[] args) {
        Student student = new Student(1, "oop");
        Student student1 = new Student(1, "Db");

        if (student == student1) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

    }
}