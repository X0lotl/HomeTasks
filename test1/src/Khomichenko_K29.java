import java.util.Scanner;

public class Khomichenko_K29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть натуральне n (3 <= n <= 1000): ");
        int n = scanner.nextInt();
        if (n > 2 && n <= 1000) {
            for (int i = 2; i < n; i++) {
                if (checkSimple(i))
                    System.out.println(i);
            }
        } else
            System.out.println("Число n не ввизначеному діапазоні");
    }

    public static boolean checkSimple(int i) {
        if (i <= 1)
            return false;
        else if (i <= 3)
            return true;
        else if (i % 2 == 0 || i % 3 == 0)
            return false;
        int n = 5;
        while (n * n <= i) {
            if (i % n == 0 || i % (n + 2) == 0)
                return false;
            n = n + 6;
        }
        return true;
    }
}

