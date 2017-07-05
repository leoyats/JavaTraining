import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by leoyats on 13.06.17.
 */
public class ArithmeticalMean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "0.0";
        double summ = 0, mean = 0, integ = 0;
        int items = 0;
        while (input.equals(".") != true) {
            integ = Double.parseDouble(input);
            summ = summ + integ;
            System.out.println("Введіть число, або . щоб зупинитися");
            input = scanner.nextLine();
            items++;
        }
        mean = summ / --items;
        System.out.println("Середнє з " + items + " Чисел " + mean);
    }

    public class Solution {
        public static void main(String[] args) throws Exception {
            //напишите тут ваш код
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            double sum = 0;
            for (int i = 0; true; i++) {
                int number = Integer.parseInt(reader.readLine());
                sum = sum + number;
                if (number == -1) {
                    System.out.println((sum + 1) /  i);
                    break;
                }
            }
        }
    }
}
