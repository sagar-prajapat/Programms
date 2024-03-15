// Create a class to print the area of a square and a rectangle. The class has two methods 
// with the same name but different number of parameters. The method for printing 
// area of a rectangle has two parameters which are length and breadth respectively 
// while the other method for printing area of square has one parameter which is side 
// of square. 

import java.util.Scanner;
class Areas{
    public static void square(int side){
        System.out.println("Area of square : "+side*side);
    }
    public static void rectangle(int length,int breadth){
        System.out.println("Area of rectangle : "+length*breadth);
    }
}
public class area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter side : ");
        int side = sc.nextInt();
        System.out.println("enter length : ");
        int length = sc.nextInt();
        System.out.println("enter breadth : ");
        int breadth = sc.nextInt();

        Areas a = new Areas();
        a.square(side);
        a.rectangle(length, breadth);
    }
}
