package Assi_4_Easy;

import java.util.Scanner;

public class Input {
    public void  input()
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number you want to print the multiple. ");
        int a = obj.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(a +" x " + i + "=" + a*i);
        }

    }

}
