package model;

import java.util.Scanner;

public class Videogame {
Controle c;

 public void definirControle(Controle c) {
	this.c = c;
 }
 
 public void iniciarJogo() {
	 if(c==null) {
		 System.out.println("Defina o jogo");
	 }
 
 
 Scanner etecla  = new Scanner(System.in);
 String t;
 do {
	 t = etecla.next();
	 if(t.equals("w"))
		 c.up();
	 if(t.equals("s"))
		 c.down();
	 if(t.equals("d"))
		 c.right();
	 if(t.equals("a"))
		 c.left();
	 if(t.equals("i"))
		 c.start();
	 if(t.equals("shift"))
		 c.button();
 }while(!t.equals("f"));
 c.end();
 
}
 
}


