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
}
