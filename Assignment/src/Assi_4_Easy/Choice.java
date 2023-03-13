package Assi_4_Easy;

import java.util.Scanner;

public class Choice {

    public int menu() {
        // design
        // menu for choice
        System.out.println("\t1. Multiplication \n\t2. Currency Converter \n\t3. Fibonacci Series");
        System.out.println("Enter your choice.");
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        return a;
    }
}
