//Take a number as input and print the multiplication table for it. The multiplication table should start from 1 to 10. The output should be on format like this
//        Suppose user gave 5 as a input:
//        5 x 1 = 5
//        5 x 2 = 10
//        …. (repeat)
//        5 x 10 = 50

package Assi_4_Easy;

public class Main {
    public static void main(String[] arg){
        Input obj1 = new Input();
        int n =obj1.input();

        for(int i=1;i<=10; i++){
            System.out.println(n + " x " + i + " = " + n*i );
        }
    }
}
