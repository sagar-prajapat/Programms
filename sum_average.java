// Write a program in Java to input 5 numbers from keyboard and find their sum and 
//average using for loop. 

import java.util.Scanner;

public class sum_average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            int n = sc.nextInt();
            sum = sum + n;
        }
        double average = (sum) / 5;
        System.out.println("sum : " + sum);
        System.out.println("average : " + average);
    }

}
