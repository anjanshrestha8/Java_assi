package Assi_4_Easy;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class CurrencyConverter {
    public void Cin(){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Nepali currency u want to convert int o Dollar.");
        System.out.print("Rs ");
        float rs = obj.nextFloat();
        System.out.println("Your Neplai Currency =" +rs +"is converted in dollar :"+(rs/135.03));
    }

}
