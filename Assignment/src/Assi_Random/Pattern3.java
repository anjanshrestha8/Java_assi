package Assi_Random;

import java.util.Scanner;
public class Pattern3 {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);   // input function
        System.out.println("***Enter the columns you want to print reverse pyramid.***");
        int column = input.nextInt();
        System.out.println("The pyramid is as follow :\n");
        Pattern3 pattern3 = new Pattern3();   // class object
        pattern3.pyramid(column);            // object call method
    }
    public static void pyramid(int x)
    {
        for(int i=5;i>=0;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}





