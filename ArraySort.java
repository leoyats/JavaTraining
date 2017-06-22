import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by leoyats on 21.06.17.
 */
public class ArraySort {
    public static void main(String[] args) {
        int[] ar= {1,9,5,6,7,2,0,5,14,20,1,5,86,45,3,6,7,45,2,33,8,4,7,5,6,2};
//        SortAndPrint(ar);
        BubbleSort(ar);
    }

/*
    public static void SortAndPrint(int[] m) {
        Arrays.sort(m);
        System.out.println(Arrays.toString(m));
        for (int i = m.length - 1; i >= 0; i--) {
            System.out.print(m[i] + " ");
        }
        System.out.println("");
    }
*/

    public static void  BubbleSort(int [] m) {
        int repeat = 0;
        boolean changeTrue = true;
        while (changeTrue) {
            changeTrue = false;
            for (int i = 0; i < m.length - 1 - repeat; i++) {
                if (m[i] > m[i + 1]) {
                    int tmp = m[i];
                    m[i] = m[i + 1];
                    m[i + 1] = tmp;
                    changeTrue = true;
                }
            }
            repeat++;
        }
        for (int i: m) {
            System.out.print(i + " ");
        }
    }
}
