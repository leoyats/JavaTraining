import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by leoyats on 03.07.17.
 */
public class MaxInteger {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());


        if (a > b && b > c &&) {
            System.out.printf("%s %s %s",a,b,c);
        } else if (b > c && c > a) {
            System.out.printf("%s %s %s",b,c,a);
        } else if (c > b && b > a) {
            System.out.printf("%s %s %s",c,b,a);
        } else if (a > c && c > b) {
            System.out.printf("%s %s %s",a,c,b);
        }
    }
