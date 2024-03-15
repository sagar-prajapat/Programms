// W.A.J.P to concatenate a given string to the end of another string.
import java.util.Scanner;
public class concate_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "prajapat";
        System.out.println("enter String : ");
        String str1 = sc.next();

        String result = str1.concat(" "+ str);
        System.out.println("New string : "+result);
    }
    
}
