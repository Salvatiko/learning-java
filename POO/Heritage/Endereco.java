public class Endereco{ //Classe Entidade

	//Atributos
	private String rua;
	private int num; 
	
	//def
	public Endereco(){
		String rua = "";
		num = 0;
	}

	//getters
	public String getRua(){
		return rua;		
	}
	public int getNum(){
		return num;		
	}
	
	//setters
	public void setRua(String rua){
		this.rua = rua;		
	}
	
	public void setNum(int num){
		this.num = num;
	}

}