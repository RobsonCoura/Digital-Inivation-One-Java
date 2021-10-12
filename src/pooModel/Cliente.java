package pooModel;

import java.util.ArrayList;
import java.util.List;

// Clase e Objeto | uma representação dados em objetos,
//ou entidades para o processamento de outros objetos.

public class Cliente extends Pessoa{


	public String numCartao;
		private List<Endereco> enderecos;
	// proteger o atributo	
		
		
		public void adicionaEndereco(Endereco endereco) {
			
			if (endereco == null) {
				throw new NullPointerException("Endereço não pode ser nulo"); 
			
			}
			
			if (endereco.cep == null ) {
				
				throw new NullPointerException("Cep não pode ser nulo"); 
			}
			getEnderecos().add(endereco);
		}
		// Encapsulamento 
		// E a possibilidade de proteger alguns dados ou funcionalidades 
		//da classe,não permitindo que seus consumidores possam acessa-la

	
	private List<Endereco> getEnderecos() {
		if (enderecos == null) {
			enderecos  = new ArrayList<Endereco>();
		}
		return enderecos;
	}

}
