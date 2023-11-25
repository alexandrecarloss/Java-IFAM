package model;

public abstract class Figura {
	private int posicaox;
	private int posicaoy;
	
	public abstract float area();
	public abstract float perimetro();
	public abstract void desenhar();
	
	
	public int getPosicaox() {
		return posicaox;
	}
	public void setPosicaox(int posicaox) {
		this.posicaox = posicaox;
	}
	public int getPosicaoy() {
		return posicaoy;
	}
	public void setPosicaoy(int posicaoy) {
		this.posicaoy = posicaoy;
	}
	
	
}
