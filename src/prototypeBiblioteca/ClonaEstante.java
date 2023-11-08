package prototypeBiblioteca;

import prototypeBiblioteca.estantes.Estante;
import prototypeBiblioteca.estantes.EstanteAZ;
import prototypeBiblioteca.estantes.EstanteGenero;

import java.util.ArrayList;
import java.util.List;

public class ClonaEstante {
	public static void main(String[] args) {
		List<Estante> estantes = new ArrayList<>();
		List<Estante> estantescopia = new ArrayList<>(); 
		
		EstanteAZ estanteaz = new EstanteAZ();
		estanteaz.letra = 'L';
		estanteaz.livros.add("Livro 1");
		estanteaz.livros.add("Livro 2");
		estanteaz.livros.add("Livro 3");
		estanteaz.livros.add("Livro 4");
		estanteaz.livros.add("Livro 5");
		estantes.add(estanteaz);
		
		EstanteGenero estantegenero = new EstanteGenero();
		estantegenero.genero = "Terror";
		estantegenero.livros.add("5 Semestres at TCC's");
		estantegenero.livros.add("5 Semestres at TCC's 2");
		estantegenero.livros.add("5 Semestres at TCC's 3, Parte 1");
		estantegenero.livros.add("5 Semestres at TCC's 3, Parte 2");
		estantegenero.livros.add("5 Semestres at TCC's: As conclusões que não te contaram");
		estantes.add(estantegenero);
		
		EstanteAZ clonestanteaz = (EstanteAZ) estanteaz.clone();
		estantescopia.add(clonestanteaz);
		
		EstanteGenero clonestantegenero = (EstanteGenero) estantegenero.clone();
		estantescopia.add(clonestantegenero);
		
		estanteaz.guardarLivros(estanteaz);
		estantegenero.guardarLivros(estantegenero);
		clonestanteaz.guardarLivros(clonestanteaz);
		clonestantegenero.guardarLivros(clonestantegenero);
	}
}
