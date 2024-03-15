// W.A.J.P to compare a given string to the specified character sequence. Comparing 
// topsint.com and topsint.com: true Comparing Topsint.com and topsint.com: false 

import java.util.Scanner;
public class compare_string {
    public static boolean compare_string(String str1,String str2){
        if(str1.equals(str2)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string1 : ");
        String str1 = sc.nextLine();
        System.out.println("enter string2 : ");
        String str2 = sc.nextLine();

        System.out.println("result : "+compare_string(str1, str2));
    }
}
