// Write a Java program to count the letters, spaces, numbers and other characters of 
//an input string. 

import java.util.Scanner;

public class count_CLO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string : ");
        String str = sc.nextLine();

        int letter = 0;
        int space = 0;
        int number = 0;
        int other = 0;

        for(int i=0;i<str.length();i++){
            char currentchar = str.charAt(i);

            if(Character.isLetter(currentchar)){
                letter++;
            }
            else if(Character.isDigit(currentchar)){
                number++;
            }
            else if(Character.isSpaceChar(currentchar)){
                space++;
            }
            else{
                other++;
            }

        }

        System.out.println("number of letter : "+letter);
        System.out.println("number of space : "+space);
        System.out.println("count of numbers : "+number);
        System.out.println("number of otherchar : "+other);
    }
}
