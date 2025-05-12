package section_3.e3_5;

import java.util.Scanner;

public class LotteryOdds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Ile liczb ma być wylosowanych? ");
        int k = in.nextInt();

        System.out.println("Jaka jest górna granica przedziału losowanych liczb? ");
        int n = in.nextInt();

        int lotteryOdds = 1;
        for(int i = 1;i<=k;i++){
            lotteryOdds = lotteryOdds * (n-i+1)/i;
        }

        System.out.println("Twoje szanse to 1 do "+lotteryOdds+". Powodzenia");

    }
}
