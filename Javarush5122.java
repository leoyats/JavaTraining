import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by leoyats on 05.07.17.
 */
public class Javarush5122 {
    public static void main(String[] args) {
        Date d = new Date();
        SimpleDateFormat format1 = new SimpleDateFormat("dd MM yyyy");
        System.out.println(format1.format(d));
    }
}
