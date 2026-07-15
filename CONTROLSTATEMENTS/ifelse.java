import java.util.Scanner;

public class ifelse {

    public static void main(String[] args) {

        // Voting Eligibility Checker
        int age = 18;

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        // Largest of Two Numbers
        int a = 10;
        int b = 20;

        if (a > b) {
            System.out.println("Largest Number = " + a);
        } else {
            System.out.println("Largest Number = " + b);
        }

        // Even or Odd
        int c = 7;

        if (c % 2 == 0) {
            System.out.println("The number is Even.");
        } else {
            System.out.println("The number is Odd.");
        }

        // Scanner (Try-With-Resources)
        try (Scanner sc = new Scanner(System.in)) {

            // Income Tax Calculator
            System.out.print("\nEnter your annual income: ");
            int income = sc.nextInt();

            int tax;

            if (income < 500000) {
                tax = 0;
            } else if (income <= 1000000) {
                tax = income * 20 / 100;
            } else {
                tax = income * 30 / 100;
            }

            System.out.println("Tax Applicable = " + tax);

            // Largest of Three Numbers
            System.out.println("\nEnter three numbers:");

            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int num3 = sc.nextInt();

            if (num1 >= num2 && num1 >= num3) {
                System.out.println("Largest Number = " + num1);
            } else if (num2 >= num1 && num2 >= num3) {
                System.out.println("Largest Number = " + num2);
            } else {
                System.out.println("Largest Number = " + num3);
            }

            // Student Result Checker
            System.out.print("\nEnter student marks: ");
            int marks = sc.nextInt();

            if (marks >= 33) {
                System.out.println("Result: PASS");
            } else {
                System.out.println("Result: FAIL");
            }
        }
    }
}