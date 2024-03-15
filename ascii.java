import java.util.Scanner;

public class ascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter character : ");
        String  c = sc.next();
    
        for(char i=0;i<c.length();i++){
            int currentchar = c.charAt(i);
            System.out.print((int)currentchar+" ");
        }
           

    }
}

