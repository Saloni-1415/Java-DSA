/* import java.util.*;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String input = sc.next();
        // System.out.println(input);

        // String name = sc.nextLine();
        // System.out.println(name);

        float input = sc.nextFloat();
        System.out.println(input);

        sc.close();
    }
} */

import java.util.*;
public class Input {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();
        int sum = a + b ;
        System.out.println("Sum= " + sum);

        System.out.print(" Enter your radius : ");
        float radius = sc.nextInt();
        float area = 3.14f * radius * radius; 
        System.out.println("Radius = " + area);
    }
}