package section_3.e3_9;

import java.util.Arrays;
import java.util.Scanner;
public class LotteryArray {
    public static void main(String[] args) {

        final int NMAX = 10;

        int[][] odds = new int[NMAX+1][];

        for (int i = 0; i <= NMAX; i++) {
            odds[i]=new int[i+1];
        }

        for (int n = 0; n < odds.length; n++) {
            for (int k = 0; k < odds[n].length; k++) {

                int lotteryOdds = 1;
                for (int i = 1; i <+ k; i++) {
                    lotteryOdds = lotteryOdds * (n-i+1)/i;
                }
                odds[n][k] = lotteryOdds;
            }
        }

        for (int[] row :odds) {
            for (int odd : row){
                System.out.printf("%4d",odd);
            }
            System.out.println();
        }
    }
}
