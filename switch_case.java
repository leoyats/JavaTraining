import java.util.Scanner;

/**
 * Created by leoyats on 12.06.17.
 */
public class switch_case {
    public static void main(String[] args) {
        System.out.println("Введіть першу літеру назви області");
        String litera = "";
        Scanner scanner = new Scanner(System.in);
        litera = scanner.nextLine();

        switch (litera.toLowerCase())
        {
            case "в":

                System.out.println("Вінницька");
                break;
            case "д":
                System.out.println("дніпропетровська");
                break;
            default:
                System.out.println("Hello world");
                break;
        }
    }
}
