import model.Circulo;
import model.Quadrilatero;
import model.Triangulo;

public class Matematica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circulo c = new Circulo();
		Triangulo t = new Triangulo();
		Quadrilatero q = new Quadrilatero();
		
		t.setA(6);
		t.setB(6);
		t.setC(6);
		t.perimetro();
		t.area();
	}

}
