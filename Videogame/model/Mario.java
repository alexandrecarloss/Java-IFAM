package model;

public class Mario implements Controle{

	@Override
	public void up() {
		System.out.println("Mário pulou!");
	}

	@Override
	public void down() {
		System.out.println("Mário agachou");
	}

	@Override
	public void left() {
		System.out.println("Mário foi à esquerda");
	}

	@Override
	public void right() {
		System.out.println("Mário foi à direita");
	}

	@Override
	public void start() {
		System.out.println("Vai, Mário!");
	}

	@Override
	public void end() {
		System.out.println("Tchau, Mário!");
	}

	@Override
	public void button() {
		System.out.println("Mário soltou a bola");
	}

}
