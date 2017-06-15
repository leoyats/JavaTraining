import java.util.Scanner;

/**
 * Created by leoyats on 15.06.17.
 */
public class ForDecrement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть слово");
        String world = scanner.nextLine();

        for (int i = world.length() - 1; i >= 0; i--) {
            System.out.print(world.substring(i , i +1));
        }
    }
}
