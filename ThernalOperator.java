import java.util.Scanner;

/**
 * Created by leoyats on 13.06.17.
 */
public class ThernalOperator {
    public static void main(String[] args) {
        System.out.println("Введіть свій ідентифікаційний номер:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        double price = (number > 1000 && number < 55000) ? 1.0 : 3.0;
//        if (number > 1000 && number < 55000) {
//            price = 2.0;
//        } else {
//            price = 3.0;
//        }
        System.out.println("Ваша ціна " + price);
    }
}
