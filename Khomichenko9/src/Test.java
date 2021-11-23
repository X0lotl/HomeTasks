import javafx.util.Pair;

import java.util.ArrayList;

public class Test {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    Student student = new Student("Danil", "Khomichenko");
    public boolean test = true;

    boolean testPrintStudent10Times() {
        test = true;
        String result = "Danil Khomichenko \n" +
                "Danil Khomichenko \n" +
                "Danil Khomichenko \n" +
                "Danil Khomichenko \n" +
                "Danil Khomichenko \n" +
                "Danil Khomichenko \n" +
                "Danil Khomichenko \n" +
                "Danil Khomichenko \n" +
                "Danil Khomichenko \n" +
                "Danil Khomichenko \n";
        String resultFromMethod = student.printStudent10Times();
        if (!result.equals(resultFromMethod))
            test = false;
        return test;
    }

    boolean testSquaresTable() {
        test = true;
        String result = "1^2 = 1.0\n" +
                "3^2 = 9.0\n" +
                "5^2 = 25.0\n" +
                "7^2 = 49.0\n" +
                "9^2 = 81.0\n";
        String resultFromMethod = student.squaresTable();
        if (!result.equals(resultFromMethod))
            test = false;
        return test;
    }

    boolean testSumNFirst() {
        test = true;
        int result = 2080;
        int resultFromMethod = student.sumNFirst(64);
        if (result != resultFromMethod)
            test = false;
        return test;
    }

    boolean testSumNFirstOdd() {
        test = true;
        int result = 4096;
        int resultFromMethod = student.sumNFirstOdd(64);
        if (result != resultFromMethod)
            test = false;
        return test;
    }

    boolean testSumNFirstMultiplicativeInverse() {
        test = true;
        double result = 4.7438909037057675;
        double resultFromMethod = student.sumNFirstMultiplicativeInverse(64);
        if (result != resultFromMethod)
            test = false;
        return test;
    }

    boolean testPowerOfTwoTable() {
        test = true;
        String result = "2^0 = 1\n" +
                "2^1 = 2\n" +
                "2^2 = 4\n" +
                "2^3 = 8\n" +
                "2^4 = 16\n" +
                "2^5 = 32\n" +
                "2^6 = 64\n" +
                "2^7 = 128\n" +
                "2^8 = 256\n" +
                "2^9 = 512\n" +
                "2^10 = 1024\n";
        String resultFromMethod = student.powerOfTwoTable();
        if (!result.equals(resultFromMethod))
            test = false;
        return test;
    }

    boolean testFactorial() {
        test = true;
        int result = 362880;
        int resultFromMethod = student.factorial(9);
        if (result != resultFromMethod)
            test = false;
        return test;
    }

    boolean testFunction() {
        test = true;
        String result = "f(-2.0) = -22.6\n" +
                "f(-1.75) = -19.1\n" +
                "f(-1.5) = -15.899999999999999\n" +
                "f(-1.25) = -13.0\n" +
                "f(-1.0) = -10.4\n" +
                "f(-0.75) = -8.1\n" +
                "f(-0.5) = -6.1\n" +
                "f(-0.25) = -4.4\n" +
                "f(0.0) = -3.0\n" +
                "f(0.25) = -1.9\n" +
                "f(0.5) = -1.1\n" +
                "f(0.75) = -0.5999999999999996\n" +
                "f(1.0) = -0.3999999999999999\n" +
                "f(1.25) = -0.5\n" +
                "f(1.5) = -0.8999999999999995\n" +
                "f(1.75) = -1.5999999999999996\n" +
                "f(2.0) = -2.5999999999999996\n";
        String resultFromMethod = student.function();
        if (!result.equals(resultFromMethod))
            test = false;
        return test;
    }

    boolean testArithmeticMean4Random10() {
        test = true;
        Pair<ArrayList<Integer>, Double> input = student.random10();
        double result = input.getValue();
        ArrayList<Integer> static10 = input.getKey();
        int arithmeticMeanSum = static10.stream().mapToInt(Integer::intValue).sum();
        double resultFromMethod = (double) arithmeticMeanSum / 10;
        if (result != resultFromMethod)
            test = false;
        return test;
    }

    boolean testIsNumberPrime() {
        String result = "8191 is prime\n";
        String resultFromMethod = student.isNumberPrime(8191);
        if (!result.equals(resultFromMethod))
            test = false;
        return test;
    }

    String outputColorChanger(boolean test) {
        String outputColor = ANSI_GREEN;
        if (!test)
            outputColor = ANSI_RED;
        return outputColor;
    }

    void testAllMethods() {
        Test test = new Test();
        String ANSI_COLOR;
        ANSI_COLOR = test.outputColorChanger(test.testPrintStudent10Times());
        System.out.println(ANSI_COLOR + "The test PrintStudent10Times was successful:" + test.testPrintStudent10Times());

        ANSI_COLOR = test.outputColorChanger(test.testSquaresTable());
        System.out.println(ANSI_COLOR + "The test SquaresTable was successful: " + test.testSquaresTable());

        ANSI_COLOR = test.outputColorChanger(test.testSumNFirst());
        System.out.println(ANSI_COLOR + "The test SumNFirst was successful: " + test.testSumNFirst());

        ANSI_COLOR = test.outputColorChanger(test.testSumNFirstOdd());
        System.out.println(ANSI_COLOR + "The test SumNFirstOdd was successful: " + test.testSumNFirstOdd());

        ANSI_COLOR = test.outputColorChanger(test.testSumNFirstMultiplicativeInverse());
        System.out.println(ANSI_COLOR + "The test SumNFirstMultiplicativeInverse was successful: " + test.testSumNFirstMultiplicativeInverse());

        ANSI_COLOR = test.outputColorChanger(test.testPowerOfTwoTable());
        System.out.println(ANSI_COLOR + "The test PowerOfTwoTable was successful: " + test.testPowerOfTwoTable());

        ANSI_COLOR = test.outputColorChanger(test.testFactorial());
        System.out.println(ANSI_COLOR + "The test Factorial was successful: " + test.testFactorial());

        ANSI_COLOR = test.outputColorChanger(test.testFunction());
        System.out.println(ANSI_COLOR + "The test Function was successful: " + test.testFunction());

        ANSI_COLOR = test.outputColorChanger(test.testArithmeticMean4Random10());
        System.out.println(ANSI_COLOR + "The test ArithmeticMean4Random10 was successful: " + test.testArithmeticMean4Random10());

        ANSI_COLOR = test.outputColorChanger(test.testIsNumberPrime());
        System.out.println(ANSI_COLOR + "The test IsNumberPrime was successful: " + test.testIsNumberPrime());
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.testAllMethods();
    }
}