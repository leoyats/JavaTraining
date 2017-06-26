/**
 * Created by leoyats on 26.06.17.
 */
public class GlobalLocalVar {

    public static int obj = 0;
    public static void main(String[] args) {
        System.out.println(obj);
        obj = 1;
        System.out.println(obj);
        AddObj();
        System.out.println(obj);
        DelObj();
        System.out.println(obj);
    }
    public static void AddObj() {
        obj++;
    }
    public static void DelObj() {
        obj = 0;
    }

}
