import java.util.Scanner;

public class AverageCalculator{
    public static void main(String[] args){
        int a, b;
        long c;
        double average;
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the first number (an int): ");
        a = sc.nextInt();
        System.out.print("Please enter the second number (an int): ");
        b = sc.nextInt();
        System.out.print("Please enter the third number (an long): ");
        c = sc.nextLong();
        sc.close();

        average = (a + b + c) / 3.0;

        System.out.print("\nThe average of " + a + ", " + b + ", " + c
                          + " is " + average);
    
    }
}