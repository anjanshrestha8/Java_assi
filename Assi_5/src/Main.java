// Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5
// units by creating a class named 'Triangle' with constructor having the three sides as its parameters.
public class Main {
    public static void main(String[] args) {
        Triangle obj =new Triangle();
        Triangle obj1 =new Triangle(5,3,4);
        obj.area();
        obj1.area();
        obj.perimeters();
        obj1.perimeters();

    }
}