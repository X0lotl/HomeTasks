import java.util.ArrayList;
import java.util.Scanner;

public class Khomichenko_R28 {
    public static ArrayList<Integer> ArrayMaker(int k) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(2);
        return arrayList;
    }

    public static void calculating(int k, int i, ArrayList<Integer> arrayList) {
        int arrayAdd = arrayList.get(i - 1) + arrayList.get(i - 3);
        if (arrayAdd <= k) {
            arrayList.add(arrayAdd);
            calculating(k, i + 1, arrayList);
        } else {
            int sum = 0;
            for (int n = 0; n < arrayList.size(); n++) {
                sum += arrayList.get(n);
            }
            System.out.println("Сумма: " + sum);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число k");
        int k = scanner.nextInt();
        ArrayList<Integer> arrayList = ArrayMaker(k);
        int i = 3;
        calculating(k, i, arrayList);
    }
}
