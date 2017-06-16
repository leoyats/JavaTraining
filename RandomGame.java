import java.util.Random;
import java.util.Scanner;

/**
 * Created by leoyats on 16.06.17.
 */
public class RandomGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int intCube = 0, intUser = 0, tryUser = 0;

        do {
            System.out.print("Введіть число від 1 до 6: ");
            intUser = scanner.nextInt();
            intCube = 1 + random.nextInt(6);
            System.out.println("На кубику випало число: " + intCube);
            tryUser++;
        }
        while (intUser != intCube);
        System.out.println("Ви вгадали з спроби " + tryUser);
    }
}
