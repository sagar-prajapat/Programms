// W.A.J.P to check whether a given string starts with the contents of another string. 
// Red is favorite color. Starts with Red? True Orange is also my favorite color. Starts 
// with Red? False I3.  

import java.util.Scanner;
public class String_startwith {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter String : ");
        String str = sc.nextLine();
        System.out.println("enter start String : ");
        String strstart = sc.nextLine();

        boolean StartWith = str.startsWith(strstart);
        System.out.println(StartWith);

    }
}
