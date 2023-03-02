public class Triangle {
    int a,b,c;
    Triangle(){
        a=3;
        b=4;
        c=5;
    }
    Triangle(int d, int e, int f){
        a=d;
        b=e;
        c=f;
    }
    public void area() {
        int s = (a + b + c) / 2;
        s = (s * (s - a) * (s - b) * (s - c));
        System.out.println("The area of the triangle is:" + s);
    }
    public void perimeters(){
        int p =a+b+c;
        System.out.println("The perimeter is:"+p);
    }




}

