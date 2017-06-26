import java.util.Scanner;

/**
 * Created by leoyats on 26.06.17.
 */
public class HomeWorkTryCatch {
    public static void main(String[] args) {
        boolean incorrectData = false;

        do {
            try {
                Scanner scanner = new Scanner(System.in);
                Scanner scanner2 = new Scanner(System.in);

                System.out.print("Введіть свій вік:\t");
                short year = scanner.nextShort();


                System.out.print("Введіть свій зріст:\t");
                double height = scanner.nextDouble();


                System.out.print("Введіть своє ім'я:\t");
                String name = scanner2.nextLine();

                System.out.println("Твій вік " + year + ", твій зріст " + height + ", твоє ім'я " + name);


                incorrectData = false;
            }
            catch (Exception e) {
                incorrectData = true;
                System.out.println("Введення даних повинне бути коректне");
            }

        }
        while (incorrectData);
    }
}


