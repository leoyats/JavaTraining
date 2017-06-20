/**
 * Created by leoyats on 20.06.17.
 */
public class StringArray {
    public static void main(String[] args) {
        String[] arrayS = new String[4];
        arrayS[0] = "January";
        arrayS[1] = "January2";
        arrayS[2] = "January3";
        arrayS[3] = "January4";

        System.out.println(arrayS[0]);
        System.out.println(arrayS[1]);
        System.out.println(arrayS[2]);
        System.out.println(arrayS[3]);

        String[] fruits = {"apple", "pinapple", "bananas", "cherry"};


        System.out.println(" ");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }




    }
}
