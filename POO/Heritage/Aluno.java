public class Aluno extends Pessoa implements MostraRa{ //Classe Entidade

	//Atributos
	private String curso;
	private int ra; 
	
//=====================================
// Método da interface MostraRa

	public void calcRa(){
		this.ra += val;
		System.out.println("\nNOVO valor do ra: "+this.ra);
		
	}	

	public Aluno(){
		super();
		ra = 0;
		curso = "";
	}

	
	
	
//======================================	
	public void impDados(){
		System.out.println("\nMétodo impDados DEFAULT - ALUNO");	
	}
//=======================================	

	//getters
	public String getCurso(){
		return curso;		
	}
	public int getRa(){
		return ra;		
	}
	
	//setters
	public void setCurso(String curso){
		this.curso = curso;		
	}
	
	public void setRa(int ra){
		this.ra = ra;
	}
}