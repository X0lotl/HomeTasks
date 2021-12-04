package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StringReplace {
    private static void writeFile(String output, final String filePath) throws IOException {
        FileWriter writer = new FileWriter(filePath);
        writer.write(output);
        writer.close();
    }

    private static String readFile(final String neededStringToBeReplaced, final String neededStringThatReplace, final String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);
        StringBuilder outputBuilder = new StringBuilder();
        String scannerNextLine;
        while (scanner.hasNextLine()) {
            scannerNextLine = scanner.nextLine() + "\n";
            outputBuilder.append(scannerNextLine.replaceAll(neededStringToBeReplaced, neededStringThatReplace));
        }
        return outputBuilder.toString();
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file name (or file path): ");
        final String filePath = scanner.nextLine();
        System.out.print("Enter text that needs to be replaced:");
        final String neededStringToBeReplaced = scanner.nextLine();
        System.out.print("Enter replacement text: ");
        final String neededStringThatReplace = scanner.nextLine();
        writeFile(readFile(neededStringToBeReplaced, neededStringThatReplace, filePath), filePath);
    }
}