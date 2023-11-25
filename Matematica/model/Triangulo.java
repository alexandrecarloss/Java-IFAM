package model;

public class Triangulo extends Figura {
	private float a;
	private float b;
	private float c;
	public float getA() {
		return a;
	}
	public void setA(float a) {
		this.a = a;
	}
	public float getB() {
		return b;
	}
	public void setB(float b) {
		this.b = b;
	}
	public float getC() {
		return c;
	}
	public void setC(float c) {
		this.c = c;
	}
	@Override
	public float area() {
		// TODO Auto-generated method stub
		return (float) (Math.sqrt(((perimetro() / 2) - a) * ((perimetro() / 2) - b) * ((perimetro() / 2) - c) * (perimetro() / 2)));
	}
	@Override
	public float perimetro() {
		// TODO Auto-generated method stub
		return (float) (a+b+c);
	}
	@Override
	public void desenhar() {
		// TODO Auto-generated method stub
		
	}
	
}
