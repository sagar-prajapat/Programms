// W.A.J.P to check whether a given string ends with the contents of another string. 
//"Java Exercises" ends with "se"? False "Java Exercise" ends with "se"? True 

import java.util.Scanner;
public class String_Andwith {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter main string : ");
        String mString = sc.nextLine();
        System.out.println("enter end string : ");
        String eString = sc.nextLine();


        boolean Endwith = mString.endsWith(eString);  //use endwith()
        System.out.println(Endwith);

    }
}
