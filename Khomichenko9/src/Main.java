import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student's first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter student's second name: ");
        String lastName = scanner.nextLine();

        Student student = new Student(firstName, lastName);
        System.out.print(
                "What method do you want to do? (use <<q>> to exit the program and <<test>> to run Test class)\n" +
                        "(1 - print student first- and lastnames 10 times)\n" +
                        "(2 - print the table of squares of first 5 odd numbers)\n" +
                        "(3 - print the sum of first n positive integers numbers)\n" +
                        "(4 - print the sum of first n positive odd integers numbers)\n" +
                        "(5 - print the sum of first n multiplicative inverses)\n" +
                        "(6 - print the table of powers of 2 from 0 to 10)\n" +
                        "(7 - print the factorial of number n)\n" +
                        "(8 - print the values of quadratic function)\n" +
                        "(9 - print 10 random numbers and the average of them)\n" +
                        "(10 - check if the number n is prime));\n");
        String methodPick = scanner.next();
        switch (methodPick) {
            case "1":
                System.out.println(student.printStudent10Times());
                break;
            case "2":
                System.out.println(student.squaresTable());
                break;
            case "3":
                System.out.print("Enter <<n>> for calculate sum n first positive integers: ");
                int n = scanner.nextInt();
                System.out.println("Sum n first positive integers = " + student.sumNFirst(n));
                break;
            case "4":
                System.out.print("Enter <<n>> for calculate sum n first positive odd integers: ");
                n = scanner.nextInt();
                System.out.println("Sum " + n + " first positive odd integers = " + student.sumNFirstOdd(n));
                break;
            case "5":
                System.out.print("Enter <<n>> for calculate sum n first multiplicative inverses: ");
                n = scanner.nextInt();
                System.out.println("Sum " + n + " first Multiplicative inverses = " + student.sumNFirstMultiplicativeInverse(n));
                break;
            case "6":
                System.out.println(student.powerOfTwoTable());
                break;
            case "7":
                System.out.print("Enter number for calculate factorial of this number: ");
                n = scanner.nextInt();
                System.out.println(n + "! = " + student.factorial(n));
                break;
            case "8":
                System.out.println(student.function());
                break;
            case "9":
                System.out.println("Arithmetic mean for random 10 numbers is = " + student.random10());
                break;
            case "10":
                System.out.print("Enter number to chek is it primal:");
                n = scanner.nextInt();
                System.out.println(student.isNumberPrime(n));
                break;
            case "q":
                break;
            case "test":
                Test test = new Test();
                test.testAllMethods();
        }
    }
}