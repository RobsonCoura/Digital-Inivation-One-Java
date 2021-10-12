package pooModel;

import java.util.ArrayList;
import java.util.List;

// Clase e Objeto | uma representa��o dados em objetos,
//ou entidades para o processamento de outros objetos.

public class Cliente extends Pessoa{


	public String numCartao;
		private List<Endereco> enderecos;
	// proteger o atributo	
		
		
		public void adicionaEndereco(Endereco endereco) {
			
			if (endereco == null) {
				throw new NullPointerException("Endere�o n�o pode ser nulo"); 
			
			}
			
			if (endereco.cep == null ) {
				
				throw new NullPointerException("Cep n�o pode ser nulo"); 
			}
			getEnderecos().add(endereco);
		}
		// Encapsulamento 
		// E a possibilidade de proteger alguns dados ou funcionalidades 
		//da classe,n�o permitindo que seus consumidores possam acessa-la

	
	private List<Endereco> getEnderecos() {
		if (enderecos == null) {
			enderecos  = new ArrayList<Endereco>();
		}
		return enderecos;
	}

}
