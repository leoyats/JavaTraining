import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by leoyats on 04.07.17.
 */
public class JavaRush473 {
    public static void main(String[] args) throws IOException {
        BufferedReader read  = new BufferedReader(new InputStreamReader(System.in));

        int[] list = new int[3];
        int countPlus = 0;
        int countMinus = 0;

        for (int i = 0; i < 3; i++ ){
            list[i] = Integer.parseInt(read.readLine());
            if(list[i] > 0 && list[i] != 0){
                countPlus++;
            }
            else if(list[i] < 0 && list[i] != 0){
                countMinus++;
            }
        }
        System.out.println("количество отрицательных чисел: " + countMinus);
        System.out.println("количество положительных чисел: " + countPlus);

    }
}
