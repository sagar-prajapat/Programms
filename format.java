// Write a Java program that accepts an integer (n) and computes the value of 
// n+nn+nnn. Input number: 5  
// 5 + 55 + 555 
import java.util.Scanner;
public class format {
    public static int compute(int n){
        int nn = n*11;
        int nnn = n*111;
        return n+nn+nnn;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter integer : ");
        int n = sc.nextInt();

        System.out.println(compute(n));

    }
}
