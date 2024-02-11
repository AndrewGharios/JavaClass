import java.util.Scanner;

/*
This program will calculate the mortgage of your house. Input the loan amount, annual interest
and the term length, the program will calculate your monthly payment, your total payment as well
as your interest paid. */

public class Mortgage{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int loan;
        double interest, monthly, total, interestPaid;
        int term;

        do
        {
            System.out.print("Please enter a positive integer for the loan amount: ");
            loan = input.nextInt();
            if (loan < 0){
                System.out.print("RETRY: ");
            }
            
        } while (loan < 0);

        do {

            do
            {
                System.out.print("Please enter a positive number for the annual interest rate: ");
                interest = input.nextDouble();
                if (interest < 0){
                    System.out.print("RETRY: ");
                }
                
            } while (interest < 0);

            do
            {
                System.out.print("Please enter a positive integer for the term in years: ");
                term = input.nextInt();
                if (term < 0){
                    System.out.print("RETRY: ");
                }
                
            } while (term < 0);

            
            System.out.println("For a loan with these characteristics:");
            System.out.printf("%7s %d %n", "$" , loan);
            System.out.printf("%10.2f %s %n", interest, "annual interest rate");
            System.out.printf("%8d %s %n", term, "year term");
            
            interest /= 100;
            interest /= 12;
            term *= 12;

            monthly = (loan * (interest * Math.pow(1 + interest, term)) / (Math.pow(1 + interest, term) - 1));

            total = monthly * term;
            interestPaid = total - loan;

            System.out.printf("%s %8.2f %n" ,"The Monthly Payment = $", monthly);
            System.out.printf("%s %8.2f %n", "The Total Amount Paid = $", total);
            System.out.printf("%s %4.2f %n","The Total Interest Paid = $", interestPaid);
            System.out.println();

            do
            {
                System.out.print("Please enter a positive integer for the loan amount: ");
                loan = input.nextInt();
                if (loan < 0){
                    System.out.print("RETRY: ");
                }
                
            } while (loan < 0);

        } while (loan != 0);

        input.close();
        System.out.println("THANK YOU FOR USING THE MORTGAGE CALCULATOR!");

    }
}