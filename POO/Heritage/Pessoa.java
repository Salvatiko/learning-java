public class Pessoa{ //Classe Entidade

	//Atributos
	private String nome;
	private int cpf; 
	private Endereco ender; 

	public Pessoa(){
		System.out.println("\nMétodo Construtor Default - classe Pessoa");
		cpf = 0;
		nome = "";
		ender = new Endereco();

	}
	
	public Pessoa(int cpf, String nome, Endereco ender){
		System.out.println("\nMétodo Construtor SOBREC 1 - classe Pessoa");
		this.cpf = cpf;
		this.nome = nome;
		this.ender = ender;
	}
	
	public Pessoa(String nome, int cpf, Endereco ender){
		System.out.println("\nMétodo Construtor SOBREC 2 - classe Pessoa");
		this.cpf = cpf;
		this.nome = nome;
		this.ender = ender;
	}	
	
//==============================================

	public void impDados(){
		System.out.println("\nMétodo impDados DEFAULT");	
	}
	
	public void impDados(int x){
		System.out.println("\nMétodo impDados SOBREC 1: "+x);	
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