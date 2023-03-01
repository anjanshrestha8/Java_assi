import java.util.Scanner;

public class Average {
    int i=0,sum=0;
    public void input(){
        Scanner input= new Scanner(System.in);
        int[] num = new int[3];

        System.out.println("Enter three numbers.");
        for(i=0;i<=2;i++){
            num[i]=input.nextInt();
            sum = sum+num[i];

        }
    }
    public void mean(){
        int mean = sum/3;
        System.out.println("The average of three number is:"+mean);
    }




}
