package prototypeBiblioteca.estantes;

import java.util.ArrayList;
import java.util.List;

public abstract class Estante {
	public List<String> livros = new ArrayList<>();
	
	public Estante(){
		
	}
	
	public Estante(Estante stnt) {
		if (stnt != null) {
			this.livros = stnt.livros;
		}
	}
	
	public abstract Estante clone();

	public void guardarLivros(Estante stnt) {
		System.out.println("Estante padrão com os livros: ");
		stnt.livros.forEach(System.out::println);
	}
}


