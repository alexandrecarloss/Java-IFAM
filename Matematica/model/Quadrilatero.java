package model;

public class Quadrilatero extends Figura {
	private float b;
	private float h;
	public float getB() {
		return b;
	}
	public void setB(float b) {
		this.b = b;
	}
	public float getH() {
		return h;
	}
	public void setH(float h) {
		this.h = h;
	}
	@Override
	public float area() {
		// TODO Auto-generated method stub
		return (float) (b * h);
	}
	@Override
	public float perimetro() {
		// TODO Auto-generated method stub		
		return (float) (b*2 + h*2); 
	}
	@Override
	public void desenhar() {
		// TODO Auto-generated method stub
		
	}
	
}
