import java.util.Random;
import java.util.Scanner;

public class Code {
    Random random = new Random();
    int computerChoice = random.nextInt(10);
    Scanner in =new Scanner(System.in);
    public void input(){
        System.out.println("\n****Choose a level you want to play.****.");
        System.out.println("1. Easy\n2. Medium \n3. Hard");
        int n = in.nextInt();
        System.out.println(n);
      s

        switch(n)
        {
            // easy mode user class ko object bana ra data member acess garne.
            case 1:
            {
//                if()
            }

            // medium mode
            case 2:
            {

            }
            // hard mode
            case 3:
            {

            }
        }
    }
}
