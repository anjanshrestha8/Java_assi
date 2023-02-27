import java.util.Random;
import java.util.Scanner;


public class Main {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_CYAN = "\u001B[36m";

    public static void main(String[] args) {

        // level choose garne
        System.out.println(ANSI_CYAN + "\n\n⚙︎⚙︎⚙︎⚙︎⚙︎"+ ANSI_RESET +" Choose the level "+ANSI_CYAN+"︎︎⚙︎⚙︎⚙︎⚙︎"+ANSI_RESET);
        System.out.println("\n---1.Easy    (1 to 10)\n---2.Medium  (1 to 50)\n---3.Hard    (1 to 100)");
        Scanner inputObj = new Scanner(System.in);
        int userChoice;
        int n = inputObj.nextInt();
        int i=0;

        switch (n){

            // level 1 (1 to 10)
            case 1:
                    Random random = new Random();
                    int level1 = random.nextInt(10);
                    System.out.println(level1);
                    System.out.println("Computer has generated a number, You have 5 chance to gsuess it.");
                    for(i=0;i<=4;i++)
                    {
                        System.out.println("Guess your number from 1 to 10");
                        userChoice = inputObj.nextInt();
                        if(userChoice>level1)
                        {
                            System.out.println( ANSI_RED+userChoice+" is too high, please guess Lower number.."+ ANSI_RESET);
                        } else if (userChoice<level1)
                        {
                            System.out.println(ANSI_RED + userChoice+" is too low, please guess Higher number.." +ANSI_RESET);
                        }
                        else{
                            System.out.println(ANSI_GREEN+"You have guessed it right.."+ANSI_RESET);

                        }

                    }
                    break;

                    // level 2 (1 to 50 )

            case 2:
                Random random1= new Random();
                int level2 = random1.nextInt(50);
                System.out.println(level2);
                System.out.println("Computer has generated a number now its ur turn to guess it.");
                for(i=0;i<=4;i++){
                    System.out.println("Guess your number from 1 to 50");
                    userChoice = inputObj.nextInt();
                    if(userChoice>level2)
                    {
                        System.out.println( ANSI_RED+userChoice+" is too high, please guess Lower number.."+ ANSI_RESET);
                    } else if (userChoice<level2)
                    {
                        System.out.println(ANSI_RED + userChoice+" is too low, please guess Higher number.." +ANSI_RESET);
                    }
                    else{
                        System.out.println(ANSI_GREEN+"You have guessed it right.."+ANSI_RESET);

                    }
                }
                break;
                // level 3 (1 to 100)

            case 3:
                Random random2= new Random();
                int level3 = random2.nextInt(100);
                System.out.println(level3);
                System.out.println("Computer has generated a number now its ur turn to guess it.");
                for(i=0;i<=4;i++){
                    System.out.println("Guess your number from 1 to 100");
                    userChoice = inputObj.nextInt();
                    if(userChoice>level3)
                    {
                        System.out.println( ANSI_RED+userChoice+" is too high, please guess Lower number.."+ ANSI_RESET);
                    } else if (userChoice<level3)
                    {
                        System.out.println(ANSI_RED + userChoice+" is too low, please guess Higher number.." +ANSI_RESET);
                    }
                    else{
                        System.out.println(ANSI_GREEN+"You have guessed it right.."+ANSI_RESET);

                    }
                }
                break;
        }




















    }
}



