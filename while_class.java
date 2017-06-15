import java.util.Scanner;

/**
 * Created by leoyats on 12.06.17.
 */
public class while_class {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int integ = 0;

    while (integ != 5)
    {
        System.out.println("Вгадайде число: ");
        integ = scanner.nextInt();
    }
    System.out.println("Вай красава!");
    }
}
