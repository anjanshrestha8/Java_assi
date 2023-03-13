package Assi_Combined;

import java.util.Scanner;

public class Average {
    int[] input = new int[3];
    int sum=0;
    public void average(){
        System.out.println("Enter the number.");
        Scanner obj = new Scanner(System.in);
        for(int i=0;i<=2;i++){
            input[i]= obj.nextInt();
            sum =sum+input[i];
        }
    }

    public void calculation(){
        sum =sum/3;
        System.out.println("The avaerage of the given number is "+sum);
    }


}
