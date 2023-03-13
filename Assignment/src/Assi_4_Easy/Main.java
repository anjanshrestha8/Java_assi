//     1. Take a number as input and print the multiplication table for it. The multiplication table should start from 1 to 10. The output should be on format like this
//        Suppose user gave 5 as a input:
//        5 x 1 = 5
//        5 x 2 = 10
//        …. (repeat)
//        5 x 10 = 50

//    2. Make the Currency converter program where Nepali rupees are converted to the
//       USD. Take the currency difference as 1 USD = 135.03 for conversation.

package Assi_4_Easy;

public class Main {
    public static void main(String[] arg){
//        choice is passed
        Choice obj1 = new Choice();
        int choice = obj1.menu();

        // case difference

        switch(choice) {

            case 1: {
                Input obj = new Input();
                obj.input();
            }
            case 2: {
                CurrencyConverter obj = new CurrencyConverter();
                obj.Cin();
            }
            case 3:{
                Fibonacci obj = new Fibonacci();
                obj.fibonacci();
            }
        }
    }
}
