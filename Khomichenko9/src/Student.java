public class Student {
    private final String _firstname;
    private final String _lastname;

    Student(String firstname, String lastname) {
        this._firstname = firstname;
        this._lastname = lastname;
    }

    String printStudent10Times() {
        String name ="";
        for (int i = 0; i < 10; i++) {
            name += this._firstname + " " + this._lastname + " \n";
        }
        return (name);
    }

    void squaresTable() {
        for (int i = 1; i <= 5; i++) {
            int number = ((i * 2) - 1);
            System.out.printf("%d^2 = %d \n", number, number * number);
        }
    }

    void sumNFirst(int n)   {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    void sumNFirstOdd(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int number = ((i * 2) - 1);
            sum += number;
        }
        System.out.println(sum);
    }

    void sumNFirstMultiplicativeInverse(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (1 / (double) i);
        }
        System.out.println(sum);
    }

    void powerOfTwoTable() {
        for (int i = 0; i <= 10; i++) {
            int number = (int) Math.pow(2, i);
            System.out.printf("2^%d = %d \n", i, number);
        }
    }

    int factorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }

    void function() {
        for (double i = -2; i <= 2; i += 0.25) {
            double result = ((-2.4 * (Math.pow(i, 2))) + (5 * i) - 3);
            System.out.println("f(" + i + ") = " + result);
        }
    }

    void arithmeticMean4Random10() {
        int arithmeticMeanSum = 0;
        for (int i = 0; i < 10; i++) {
            arithmeticMeanSum += (int) (Math.random() * 10);
        }
        double arithmeticMean = (double) arithmeticMeanSum / 10;
        System.out.println(arithmeticMean);
    }

    String isNumberPrime(int number) {
        boolean prime = true;
        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                prime = false;
                break;
            }
        }
        String primeOdd;
        if (prime) {
            primeOdd = " is prime";
        } else {
            primeOdd = " is not prime";
        }
        return primeOdd;
    }
}