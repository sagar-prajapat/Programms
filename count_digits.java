//Write a Java program that reads a positive integer and count the number of digits the 
//number

import java.util.Scanner;

public class count_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        if(n>0){
            while (n>0) {
                int rem = n%10;
                count++;
                n = n/10;
            }
            System.out.println(count);
        }
        else{
            System.out.println("invalid number");
        }
        
    }
}
