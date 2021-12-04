package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EvenOddLines {
    private static void writeFile(String output, final String filePath) throws IOException {
        FileWriter writer = new FileWriter(filePath);
        writer.write(output);
        writer.close();
    }

    private static void readFile(final String filePath) throws IOException {
        boolean isStringOdd = true;
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);
        StringBuilder oddOutputBuilder = new StringBuilder();
        StringBuilder evenOutputBuilder = new StringBuilder();
        while (scanner.hasNextLine()) {
            if (isStringOdd)
                oddOutputBuilder.append(scanner.nextLine() + "\n");
            else
                evenOutputBuilder.append(scanner.nextLine() + "\n");
            isStringOdd = !isStringOdd;
        }
        writeFile(oddOutputBuilder.toString(), "OddLines.txt");
        writeFile(evenOutputBuilder.toString(), "EvenLines.txt");
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file name (or file path): ");
        final String filePath = scanner.nextLine();
        readFile(filePath);
    }
}