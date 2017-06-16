/**
 * Created by leoyats on 16.06.17.
 */
public class DepositProgram {
    public static void main(String[] args) {
        // Balanse = Vklad * (1 + Protsent)^kilkistYears

        double vklad = 1000, vidsotok = 0.2, balans = 0;

        for (int year = 1; year <= 10; year++) {
            balans = Math.round(vklad * Math.pow(1 + vidsotok, year));
            System.out.println("Баланс на кінець " + year + " року: " + balans);
        }
    }
}
