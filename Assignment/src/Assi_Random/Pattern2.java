package Assi_Random;

import java.util.Scanner;
public class Pattern2 {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);   // input function
        System.out.println("***Enter the columns you want to print direct pyramid.***");
        int column = input.nextInt();
        System.out.println("The pyramid is as follow :\n\n");
        Pattern2 pattern2 = new Pattern2();   // class object
        pattern2.pyramid(column);            // object call method
    }
    public static void pyramid(int x)
    {
        for(int i=0; i<=x;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
