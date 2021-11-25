import acm.graphics.GRect;
import acm.program.*;

import java.util.Scanner;

public class Khomichenko_G9 {

    private void renderSquare(){

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть розмір квадрату: ");
        int squareSize = scanner.nextInt();
        System.out.print("Введіть розмір між прямими: ");
        int d = scanner.nextInt();
        GRect rect = new GRect(800,600,100,100);
    }
}
