import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by leoyats on 03.07.17.
 */
    public class JavaRush472 {
        public static void main(String[] args) throws Exception {
            //напишите тут ваш код
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(reader.readLine());
            printInteger(a);
        }
        public static void printInteger (int a) {
            String result="";
            String sa = Integer.toString(a);

            if ((a >= 1) && (a<=999)) {
                if (a % 2 == 0) {
                    result+="четное";
                } else {
                    result+="нечетное";
                }

                if (sa.length() == 1) {
                    result+=" однозначное";
                } else if (sa.length() == 2) {
                    result+=" двузначное";
                } else {
                    result+= " трехзначное";
                }
                result+=" число";
            } else {

            }
            System.out.println(result);
        }
    }
