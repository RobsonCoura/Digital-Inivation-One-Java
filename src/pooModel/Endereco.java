package pooModel;

// Associação de Classes
// Quando utilizamos uma classe dentro de outra classe 

public class Endereco {
	
	enum TipoEndereco { RESIDENCIAL, ENTREGA, TRABALHO	
		
	}
	
	public String endereco;
	public String numero;
	public String compleento;
	public String bairro;
	public String estado;
	public String cep;
	public TipoEndereco tipo;

}
