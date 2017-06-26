import java.util.Scanner;

/**
 * Created by leoyats on 26.06.17.
 */
public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            System.out.print("ВВедіть своє улюблене число: ");
            Scanner scanner = new Scanner(System.in);
            int integer = scanner.nextInt();
            System.out.println();
            System.out.println("Вашк улюблене число - " + integer);
        }
        catch (Exception e) {
            System.out.println("Невірно введені дані " + e.getMessage());
        }
    }
}
