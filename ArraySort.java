import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by leoyats on 21.06.17.
 */
public class ArraySort {
    public static void main(String[] args) {
        int[] ar= {1,9,5,6,7,2,0,5};
        SortAndPrint(ar);
    }
    public static void SortAndPrint(int[] m) {
        Arrays.sort(m);
        System.out.println(Arrays.toString(m));
        for (int i = m.length - 1; i >= 0; i--) {
            System.out.print(m[i] + " ");
        }
        System.out.println("");
    }
}
