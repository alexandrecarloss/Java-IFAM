package reversestring;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.print("Informe a string que deseja reverter: ");
        String str = e.nextLine();
        String reverse = "";
        for(int i = str.length() -1; i >= 0; i--) 
            reverse += str.charAt(i);
        System.out.println("A frase ao contrário é: " + reverse);
        
    }
    
}
