public class Pessoa{ //Classe Entidade

	//Atributos
	private String nome = "";
	private int cpf = 0; 
	private Endereco ender = new Endereco(); 

	public Endereco getEnder(){
		return ender;		
	}
	
	public void setEnder(Endereco ender){
		this.ender = ender;
	}

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