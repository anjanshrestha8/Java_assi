  
import java.util.Scanner;

public class Assi2 {
  
  public static void main(String[] abc){
    Scanner input =new Scanner(System.in);
    System.out.println("a) What is the total number of employees?");
    System.out.println("----");
    int a = input.nextInt();

    System.out.println("b) What is the name of supervisor?");
    System.out.println("----");
    String b = input.next();

    System.out.println("c) How many times the Nuclear waste is removed from the core?");
    System.out.println("----");
    int c =input.nextInt();

    System.out.println("d) What is the total weight of the waste produced every 1 week? ");
    System.out.println("----");
    float d =input.nextFloat();

    System.out.println("e) Is Electric Motor being replaced every 18 days? Press “y” for yes and “n” for no.");
    System.out.println("----");
    char e =  input.next().charAt(0);


    System.out.println("f) What is the core average temperature ( celsius ) of the Nuclear Reactor? ");
    System.out.println("----");
    float f= input.nextFloat();


    float g = (float) (f + 273.15);
    System.out.println("\n\n");             
    System.out.println("----Update on Nuclear Reactor Status for JX00-XC-HB1 located in the East of Japan-----:");
    System.out.println("-> Total number of employees: \t" + a);
    System.out.println("-> Supervisor name: \t" + b);
    System.out.println("-> Nuclear waste was removed from the core : \t" + c + " times ");
    System.out.println("-> Total weight of nuclear waste produced every 1 week: \t" + d);
    System.out.println("-> Is the Electric Motor being replaced every 18 days? \t" + e);
    System.out.println("-> Core average temperature in Celsius: \t" + f+ "°C");
    System.out.println("-> Core average temperature in Kelvin: \t" + g+ "K");
    System.out.println("\n\n");


    






  }
  
}
