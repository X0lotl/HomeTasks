import javafx.util.Pair;

import java.util.ArrayList;

public class Student {
    private final String _firstname;
    private final String _lastname;

    Student(String firstname, String lastname) {
        this._firstname = firstname;
        this._lastname = lastname;
    }

    String printStudent10Times() {
        String name = "";
        for (int i = 0; i < 10; i++) {
            name += this._firstname + " " + this._lastname + " \n";
        }
        return (name);
    }

    String squaresTable() {
        String result = "";
        for (int i = 1; i <= 5; i++) {
            int number = ((i * 2) - 1);
            result += number + "^2 = " + Math.pow(number, 2) + "\n";
        }
        return result;
    }

    int sumNFirst(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    int sumNFirstOdd(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int number = ((i * 2) - 1);
            sum += number;
        }
        return sum;
    }

    double sumNFirstMultiplicativeInverse(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (1 / (double) i);
        }
        return sum;
    }

    String powerOfTwoTable() {
        String result = "";
        for (int i = 0; i <= 10; i++) {
            int number = (int) Math.pow(2, i);
            result += "2^" + i + " = " + number + "\n";
        }
        return result;
    }

    int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    String function() {
        String result = "";
        for (double i = -2; i <= 2; i += 0.25) {
            double function = ((-2.4 * (Math.pow(i, 2))) + (5 * i) - 3);
            result += "f(" + i + ") = " + function + "\n";
        }
        return result;
    }

    Pair<ArrayList<Integer>, Double> random10() {
        ArrayList<Integer> random10 = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            random10.add((int) (Math.random() * 10));
        }
        int arithmeticMeanSum = random10.stream().mapToInt(Integer::intValue).sum();
        double arithmeticMean = (double) arithmeticMeanSum / 10;
        return new Pair<>(random10, arithmeticMean);
    }

    String isNumberPrime(int number) {
        String result = "";
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
        result = number + primeOdd + "\n";
        return result;
    }
}