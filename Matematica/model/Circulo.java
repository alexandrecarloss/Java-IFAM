package model;

public class Circulo extends Figura{
	private float raio;

	public float getRaio() {
		return raio;
	}

	public void setRaio(float raio) {
		this.raio = raio;
	}

	@Override
	public float area() {
		// TODO Auto-generated method stub
		//System.out.println((float) ((Math.PI)*(Math.pow(raio, 2))));
		return (float) ((Math.PI)*(Math.pow(raio, 2)));
	}

	@Override
	public float perimetro() {
		// TODO Auto-generated method stub
		//System.out.println((float) (2 * (Math.PI) * raio));
		return (float) (2 * (Math.PI) * raio);
	}

	@Override
	public void desenhar() {
		// TODO Auto-generated method stub
		
	}
	
}
