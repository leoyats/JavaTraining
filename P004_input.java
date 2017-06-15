import java.util.Scanner;

/**
 * Created by leoyats on 08.06.17.
 */
public class P004_input {
    public static void main(String[] args) {

        System.out.println("Введіть рік народження");
        Scanner scannerYear = new Scanner(System.in);

        int old = 2017 - scannerYear.nextInt();

        System.out.println("Привіт, Ваш вік" + old);
    }
}
