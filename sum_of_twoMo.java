import java.util.Scanner;

public class sum_of_twoMo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a: ");
        short a = (short) sc.nextInt();
        System.out.println("enter b: ");
        short b = (short) sc.nextInt();

        short sum = (short) (a + b);

        System.out.println("sum : " + sum);
    }
}
