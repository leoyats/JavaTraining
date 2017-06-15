import java.util.Scanner;

/**
 * Created by leoyats on 08.06.17.
 */
public class calculator {
    public static void main(String[] args) {
        Scanner fromUser = new Scanner(System.in);
        Double num1, num2, rezult;
        String operation;

        System.out.println("Введіть перше число: ");
        num1 = Double.parseDouble(fromUser.nextLine());

        System.out.println("Введіть друге число: ");
        num2 = Double.parseDouble(fromUser.nextLine());

        System.out.println("Введіть дію + - * / ^");
        operation = fromUser.nextLine();

        if (operation.equals("/") && num2 == 0) {
            System.out.println("Така операція неможлива");
            return;
        }

        if (operation.equals("+") || operation.equals("додати")) {
            rezult = num1 + num2;
            System.out.println("Сума двох чисел = " + rezult);
        } else if (operation.equals("-") || operation.equals("відняти")) {
            rezult = num1 - num2;
            System.out.println("Різниця двох чисел = " + rezult);
        } else  if (operation.equals("*") || operation.equals("помножити")) {
            rezult = num1 * num2;
            System.out.println("Множина двох чисел = " + rezult);
        } else if (operation.equals("/") || operation.equals("поділити")) {
            rezult = num1 / num2;
            System.out.println("Ділення двох чисел = " + rezult);
        }
        else {
            rezult = 0.0;
        }


    }
}
