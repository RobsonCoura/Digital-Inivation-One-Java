package poo;

// Encapsulamento 
// E a possibilidade de proteger alguns dados ou funcionalidades 
//da classe,n�o permitindo que seus consumidores possam acessa-la



import pooModel.Cliente;
import pooModel.Endereco;

public class EntregaCartaoApp {

	public static void main(String[] args) {

		Endereco endereco = new Endereco();
		endereco.cep = "0000000";
		

		// dados do endere�o

		Cliente cliente = new Cliente();
		
		

		// dados do cliente

	try {	
		cliente.adicionaEndereco(endereco);
		
		System.out.println("Endere�o adicionado com sucesso!");
	} catch (Exception e) {
		System.err.println("Houve um erro ao adicionar endere�o:" + e.getMessage());
	}
		
	
	}

}
