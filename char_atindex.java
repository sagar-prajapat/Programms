// W.A.J.P to get the character at the given index within the String. Original String = 
// Tops Technologies! The character at position 0 is T, The character at position 10 is 
// o 

import java.util.Scanner;

public class char_atindex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("enter string : ");
        String str = sc.nextLine();
        System.out.println("enter index : ");
        int idx = sc.nextInt();

        for(int i=0;i<str.length();i++){
            if(i==idx){
                char charAtIndex = str.charAt(i);
                System.out.println("character at given index : "+charAtIndex);
            }
        }
    }
}
