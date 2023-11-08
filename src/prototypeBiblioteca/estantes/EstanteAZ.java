package prototypeBiblioteca.estantes;

public class EstanteAZ extends Estante {
	public char letra;
	
	public EstanteAZ() {
		
	}
	
	public EstanteAZ(EstanteAZ stntaz) {
		super(stntaz);
		if (stntaz != null) {
			this.livros = stntaz.livros;
		}
	}
	
	public EstanteAZ(char letra) {
		super();
		this.letra = letra;
	}

	@Override
	public Estante clone() {
		return new EstanteAZ(this);
	}
	
	@Override
	public void guardarLivros(Estante stnt) {
		System.out.printf("Estante de livros que começam com a letra " + letra + ": ");
		stnt.livros.forEach(System.out::println);
	}
}