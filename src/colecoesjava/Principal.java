package colecoesjava;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Olá mundo");
		Pessoa pessoa = new Pessoa();
		Pessoa pessoa2 = new Pessoa("Renan");
		System.out.println(pessoa.getNome());
		System.out.println(pessoa2.getNome());
	}

}
