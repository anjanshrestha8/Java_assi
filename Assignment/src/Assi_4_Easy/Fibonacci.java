package Assi_4_Easy;

import java.util.Scanner;

public class Fibonacci {
    public void fibonacci(){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the no of series you want to print the Fibonacci Series.");
        int a =obj.nextInt();
        int b=0;
        int c=1;
        int sum;
        System.out.println(b);
        System.out.println(c);
        for(int i=0;i<=a;i++){
            sum = b+c;
            System.out.println(sum );
            b=c;
            c=sum;
        }

    }
}
