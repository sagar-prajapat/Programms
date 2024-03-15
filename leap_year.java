
// Write a Java program that takes a year from user and print whether that year is a leap 
//year or not. 
import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter year : ");
        int year = sc.nextInt();

        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " is leap year");
        } else {
            System.out.println(year + " is not leap year");
        }
    }
}
