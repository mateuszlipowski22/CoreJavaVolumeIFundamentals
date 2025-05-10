package section_3.e3_3;

import java.util.Scanner;

public class Retirement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Ile pieniedzy potrzebujesz aby przejsc na emeryture? ");
        double goal = in.nextDouble();

        System.out.print("Ile pieniedzy rocznie bedziesz wpłacać? ");
        double payment = in.nextDouble();

        System.out.print("Stopa procentowa w %? ");
        double interestRate = in.nextDouble();

        double balance = 0;
        int years = 0;

        while(balance<goal){
            balance+=payment;
            double interest = balance*interestRate/100;
            balance+=interest;
            years++;
        }

        System.out.println("Możesz przejsc na emerytute za "+years+" lat.");
    }
}
