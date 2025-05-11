package section_3.e3_4;

import java.util.Scanner;

public class Retirement2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Ile pieniedzy rocznie bedziesz wpłacać? ");
        double payment = in.nextDouble();

        System.out.print("Stopa procentowa w %? ");
        double interestRate = in.nextDouble();

        double balance = 0;
        int years = 0;

        String input;

        do{
            balance+=payment;
            double interest = balance*interestRate/100;
            balance+=interest;
            years++;

            System.out.printf("Po upływie %d lat stan Twojego konta wyniesie %,.2f%n",years, balance);

            System.out.print("Chcesz przejsc na emeryture? (T/N) ");

            input=in.next();

        }while(input.equalsIgnoreCase("N"));
    }
}
