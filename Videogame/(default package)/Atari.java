import model.Mario;
import model.Videogame;

public class Atari {

	public static void main(String[] args) {
		Videogame atari = new Videogame();
    atari.definirControle(new Mario());
    atari.iniciarJogo();
	}

}
