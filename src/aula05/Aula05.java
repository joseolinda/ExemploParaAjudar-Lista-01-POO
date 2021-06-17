package aula05;

public class Aula05 {

	public static void main(String[] args) {
		Dinosauro dino01 = new Dinosauro();
		Dinosauro dino02 = new Dinosauro();
		
		dino01.especie = "T Rex";
		dino01.isCarnivoro = true;
		dino01.nome = "George";
		dino01.alturaEmMetros = 3.5;
		
		dino02.especie = "Braquiossauro";
		dino02.isCarnivoro = false;
		dino02.nome = "Gabriel";
		dino02.alturaEmMetros = 28;
		
		dino01.comer();
		dino02.correr();

	}

}
