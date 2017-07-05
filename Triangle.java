/**
 * Created by leoyats on 04.07.17.
 */
public class Triangle {
    public static void main(String[] args) {
        int a = 8;
        int l = 10;
        int p = l;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < p; j++ ){
                System.out.print(" ");
            }
            p--;
            System.out.print(a);
            for (int j = 0; j < i; j++) {
                System.out.print(a);
            }
            System.out.println();
        }
    }
}
