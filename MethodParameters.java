import java.util.Scanner;

/**
 * Created by leoyats on 12.06.17.
 */
public class MethodParameters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите свое имя:");
        String name = scanner.nextLine();
        System.out.println("Введите свой город:");
        String city = scanner.nextLine();
        sayHello(name.toUpperCase(), city.toUpperCase());

        sayHello("Jhony", "Vinntytsia");
    }
    public static void sayHello(String name, String city){
        System.out.println("Привет " + name +" , from " + city);
    }
}
