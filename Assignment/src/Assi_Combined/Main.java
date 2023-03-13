package Assi_Combined;//- 1.Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units
// by creating a class named 'Triangle' with constructor having the three sides as its parameters.

//- 2.Print the average of three numbers entered by user by creating a class
// named 'Average' having a method to calculate and print the average.

//-3. Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'.
// Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your choice.");
        System.out.println("1. Area of the triangle.\n2. Perimeter of the triangle.\n3. Update of students.\n4. Calculate average.");
        Scanner num = new Scanner(System.in);
        int input = num.nextInt();
        switch(input){
            case 1:{
//                Triangle obj =new Triangle();
                Triangle obj1 =new Triangle(5,6,4);
//                obj.area();
                obj1.area();
                break;

            }
            case 2:{
//                Triangle obj2 =new Triangle();
                Triangle obj3 =new Triangle(5,3,4);
//                obj2.perimeters();
                obj3.perimeters();
                break;
            }
            case 3:{
                Student obj4 =new Student();
                obj4.update("John",1);
                break;
            }
            case 4:{
                Average obj5 =new Average();
                obj5.average();
                obj5.calculation();

            }
        }

    }
}