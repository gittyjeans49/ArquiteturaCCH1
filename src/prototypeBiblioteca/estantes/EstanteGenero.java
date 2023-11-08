package prototypeBiblioteca.estantes;

public class EstanteGenero extends Estante {
	public String genero;
	
	public EstanteGenero() {
		
	}
	
	public EstanteGenero(EstanteGenero stntgen) {
		super(stntgen);
		if (stntgen != null) {
			this.livros = stntgen.livros;
		}
	}

	public EstanteGenero(String genero) {
		super();
		this.genero = genero;
	}
	
	@Override
	public Estante clone() {
		return new EstanteGenero(this);
	}
	
	@Override
	public void guardarLivros(Estante stnt) {
		System.out.printf("Estante para livros de " + genero + ": ");
		stnt.livros.forEach(System.out::println);
	}
	
}
