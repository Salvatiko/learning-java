public class Aluno extends Pessoa{ //Classe Entidade

	//Atributos
	private String curso;
	private int ra; 

	public Aluno(){
		ra = 0;
		curso = "";
	}
	
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