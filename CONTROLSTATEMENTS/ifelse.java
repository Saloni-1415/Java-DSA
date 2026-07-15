import java.util.Scanner;
public class ifelse {

    public static void main(String[] args) {

        int age = 18;

        if (age >= 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }

        //print largest of two numbers 
        int a = 10 ;
        int b= 20 ;

    
        if(a>b){
            System.out.println("LARGEST NUMBER = " + a);
        }
        else{
            System.out.println("LARGEST NUMBER = "+ b);
        }

        // print even or odd 
        int c = 7 ;

        if (c % 2==0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }

        //Income Tax Calculator
        Scanner sc = new Scanner (System.in);
        int income = sc.nextInt();
        int tax = 0;

        if(income < 500000){
            System.out.println("0% tax applicable");
        }
        else if (income >= 500000 && income <= 1000000){
            tax = income * 20/100;
            System.out.println("Tax Applicable = " + tax);
        }
        else {
            tax = income * 30/100;
            System.out.println("Tax Applicable = " + tax);
        }

        //largest of three numbers 
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1>num2 && num1>num3){
            System.out.println("Largest Number = " + num1);
        }
        else if (num2>num1 && num2>num3){
            System.out.println("Largest Number = "+ num2);
        }
        else {
            System.out.println("Largest Number = "+ num3);
        }

        // student result checker

        int marks = sc.nextInt();

        if (marks <= 33) {
            System.out.println("PASS");
        }
        else {
            System.out.println("FAIL");
        }


    }
}