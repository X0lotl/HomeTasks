import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Danil", "Khomichenko");
        System.out.println(student.printStudent10Times());
        Test test = new Test();
        System.out.println("The test was successful: " + test.testPrintStudent10Times());
    }
}
