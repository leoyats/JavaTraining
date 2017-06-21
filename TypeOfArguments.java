/**
 * Created by leoyats on 21.06.17.
 */
public class TypeOfArguments {
    /*public static void main(String[] args) {
        int c, d;
        int rez = Calculate(10, 20);
        System.out.println(rez);

    }

    public static int Calculate(int a, int b) {
        a = a * 10;
        b = b + 10;
        return a + b;
    }*/

    public static void main(String[] args) {
        int[] myArr= {1,2,3};
        Data(myArr);
        for (int i: myArr) {
            System.out.println(i);
        }

    }

    public static void Data(int[] m) {
        for (int i = 0; i < m.length; i++) {
            m[i] = m[i] + 1;
        }
    }
}
