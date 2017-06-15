/**
 * Created by leoyats on 12.06.17.
 */
public class MyMethod {
    public static void main(String[] args) {
        sayHello();
        sayWhatsup();
    }
    public static void sayHello() {
        System.out.println("Hello user!");
        sayWhatsup();
    }

    public static void sayWhatsup() {
        System.out.println("Whatsup!!!");
        sayHello();
    }
}
