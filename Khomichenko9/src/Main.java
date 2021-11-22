import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Danil", "Khomichenko");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
            System.out.println(n + student.isNumberPrime(n));
    }
}
