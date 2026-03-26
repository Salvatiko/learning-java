public class Pessoa{

	private String nome = "";
	private int cpf = 0;
	
	public String getNome(){
		return nome;
	}
	public int getCpf(){
		return cpf;
	}
	
	public void entDados(String nome, int cpf){
	
	this.nome = nome;
	this.cpf = cpf;
	
	}
	
	public void saiDados(){
	
	System.out.println("\n Nome: "+ nome);
	System.out.println("\n CPF: "+ cpf);
	
	}

}