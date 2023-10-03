package validpalindrome;

import java.util.Scanner;

public class ValidPalindrome {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.print("Informe uma frase para verificar se é palíndromo: ");
        String str = e.nextLine();
        
        String compara = "";
        for(char c: str.toCharArray()) {
            if(Character.isDigit(c) || Character.isLetter(c)){
                compara += c;
            }
        }
        compara = compara.toLowerCase();
        int a_pointer = 0;
        int b_pointer = compara.length()-1;
        boolean comp = true;
        while(a_pointer <= b_pointer) {
            if(compara.charAt(a_pointer) != compara.charAt(b_pointer)) {
                System.out.println("Não é palíndromo!");
                comp = false;
                break;
            }
            a_pointer++;
            b_pointer--;
        }
        if(comp) {
            System.out.println("É palíndromo!");
        }
        
    }
}
