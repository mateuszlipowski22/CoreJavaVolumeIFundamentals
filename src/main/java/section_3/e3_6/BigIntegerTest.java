package section_3.e3_6;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Ile liczb ma być wylosowanych? ");
        int k = in.nextInt();

        System.out.println("Jaka jest górna granica przedziału losowanych liczb? ");
        int n = in.nextInt();

        BigInteger lotteryOdds = BigInteger.valueOf(1);
        for(int i = 1;i<=k;i++){
            lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n-i+1)).divide(BigInteger.valueOf(i));
        }

        System.out.println("Twoje szanse to 1 do "+lotteryOdds+". Powodzenia");
    }
}
