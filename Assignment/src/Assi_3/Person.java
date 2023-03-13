package Assi_3;

public class Person {
    String name =new String();

    int age;
    Person(String a,int b){
        name =a;
        age =b;
    }
    public void introduce(){
        System.out.println("Hi, my name is "+name+" and i am "+age+" years old");
    }


}

