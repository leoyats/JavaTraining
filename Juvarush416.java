import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by leoyats on 04.07.17.
 */
public class Juvarush416 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        int count = a + b + c - min - max;
        System.out.println(count);
    }
}
