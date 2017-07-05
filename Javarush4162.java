import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by leoyats on 04.07.17.
 */

//Вводить с клавиатуры числа и считать их сумму.
//        Если пользователь ввел -1, вывести на экран сумму и завершить программу.
//        -1 должно учитываться в сумме.

public class Javarush4162 {
    public static void main(String[] args) throws Exception {
        double sum = 0;
        int i = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            Double number = Double.parseDouble(reader.readLine());
            i++;
            if (number == -1) {
                break;
            }
            sum += number / i;
        }
        System.out.println(sum - 1);
    }
}
