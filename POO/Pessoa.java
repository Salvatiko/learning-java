public class Pessoa{

	static String nome = "";
	static int cpf = 0;
	
	public static void main(String[] args){
		
		Pessoa p1; //declaraçao
		p1 = new Pessoa(); //instanciaçao
		
			/*new serve para reservar um espaço 
			e Pessoa() conhecido como metodo construtor e,
			com o SO, calcula o espaço a ser utilizado*/
		
		entDados("Jesus", 10);
		saiDados();
	
	}
	
	public static void entDados(String n, int doc){
	
	nome = n;
	cpf = doc;
	
	}
	
	public static void saiDados(){
	
	System.out.println("\n Nome: "+ nome);
	System.out.println("\n CPF: "+ cpf);
	
	}

}