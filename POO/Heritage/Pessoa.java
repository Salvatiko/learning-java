public class Pessoa { //Classe Entidade

	//Atributos
	private String nome;
	private int cpf; 
	private Endereco ender;
	
//==============================================	
	public void impDados(){
		System.out.println("\nMétodo impDados DEFAULT - Pessoa");	
	}
//==============================================	

	

	public Pessoa(){
		//System.out.println("\nMétodo Construtor Default - classe Pessoa");
		cpf = 0;
		nome = "";
		ender = new Endereco();
	}
	

//==============================================

	public Endereco getEnder(){
		return ender;		
	}
	
	public void setEnder(Endereco ender){
		this.ender = ender;
	}

//==============================================

	//getters
	public String getNome(){
		return nome;		
	}
	public int getCpf(){
		return cpf;		
	}
	
	//setters
	public void setNome(String nome){
		this.nome = nome;		
	}
	
	public void setCpf(int cpf){
		this.cpf = cpf;
	}

}