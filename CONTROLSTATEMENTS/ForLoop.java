import java.util.*;

public class ForLoop {
    public static void main(String[] args) {

        // Print numbers from 1 to 5
        for (int number = 1; number <= 5; number++) {
            System.out.println(number);
        }

        System.out.println("----------------------------------------------");

        // Print only even numbers from 1 to 10
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }

        System.out.println("----------------------------------------------");

        // Print table of a number
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int y = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(y + " x " + i + " = " + (y * i));
        }

        sc.close();


    // fibbonaci series - 0 1 1 2 3 5 8 13 21 34...........
    int first = 0;
    int second = 1;
    int next;
    while(first <= 50){
        System.out.print(first + " ");
        next = first + second ;
        first = second;
        second = next ;
    }
    }
}