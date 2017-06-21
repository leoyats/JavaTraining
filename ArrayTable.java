import java.util.Scanner;

/**
 * Created by leoyats on 21.06.17.
 */
public class ArrayTable {
    public static void main(String[] args) {
        int[] games = {1896, 1900, 1904, 1908, 1912, 1916};
        String[] countries = {"Greece","France","USA","Greece","USA","UK"};
        String[] cities = {"Athens","Paris","St.Luis","Athens","St.Luis","London"};

//        System.out.println("Index\tYear\tCountry\tCity");
//        for (int i = 0; i < games.length; i++) {
//            System.out.print(i + "   \t");
//            System.out.print(games[i] + "\t");
//            System.out.print(countries[i] + " - " + cities[i] + "\n");
//        }
        System.out.println("Введіть рік: ");
        Scanner scan = new Scanner (System.in);
        int rik = scan.nextInt();
        boolean searched = false;
        for (int j=0; j<games.length; j++)
        {
            if (games[j]==rik)
            {
                System.out.print(j+"\t");
                System.out.print(games[j]+"\t");
                System.out.print(countries[j]+ " - " + cities[j] + "\n");
                searched=true;
            }
        }
        if (!searched)
        {
            System.out.println("Вибачте, у введеному році олімпійських ігор не відбувалось");
        }
    }
}
