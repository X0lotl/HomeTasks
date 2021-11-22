import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Danil", "Khomichenko");

        System.out.println(student.printStudent10Times());

        System.out.println(student.squaresTable());

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter <<n>> for calculate sum n first positive integers: ");
        int n = scanner.nextInt();
        System.out.println("Sum n first positive integers = " + student.sumNFirst(n));

        System.out.print("Enter <<n>> for calculate sum n first positive odd integers: ");
        n = scanner.nextInt();
        System.out.println("Sum n first positive odd integers = " + student.sumNFirstOdd(n));

        System.out.print("Enter <<n>> for calculate sum n first Multiplicative inverse: ");
        n = scanner.nextInt();
        System.out.println("Sum n first Multiplicative inverse = " + student.sumNFirstMultiplicativeInverse(n));

        System.out.println(student.powerOfTwoTable());

        System.out.print("Enter number for calculate factorial of this number: ");
        n = scanner.nextInt();
        System.out.println(n + "! = " + student.factorial(n));

        System.out.println(student.function());

        System.out.println("Arithmetic mean for random 10 numbers is = " + student.random10());

        System.out.print("Enter number to chek is it primal:");
        n = scanner.nextInt();
        System.out.println(student.isNumberPrime(n));
    }
}