//Write a Java program to print the ASCII value of a given character.  

import java.util.Scanner;

public class ASCII_value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter character : ");
        char c = sc.next().charAt(0);

        if(Character.isAlphabetic(c)){
            if(Character.isUpperCase(c)){
                for(char i='A';i<='Z';i++){
                    if(c==i){
                        System.out.println("ASCII value : "+(int)c);
                    }
                }
            }
            else if(Character.isLowerCase(c)){
                for(char i='a';i<='z';i++){
                    if(c==i){
                        System.out.println("ASCII value : "+(int)c);
                    }
            }
            
        }

    }
    else{
        System.out.println("invalid character");
    }
}
}
