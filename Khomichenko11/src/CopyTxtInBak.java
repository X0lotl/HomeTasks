import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CopyTxtInBak {
    private static void writeFile(String output, final String filePath) throws IOException {
        FileWriter writer = new FileWriter(filePath + ".bak");
        writer.write(output);
        writer.close();
    }

    private static String readFile(final String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);
        StringBuilder outputBuilder = new StringBuilder();
        while (scanner.hasNextLine()) {
            outputBuilder.append(scanner.nextLine() + "\n");
        }
        return outputBuilder.toString();
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file name (or file path): ");
        final String filePath = scanner.nextLine();
        writeFile(readFile(filePath), filePath);
    }
}