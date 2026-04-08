public class Prof extends Pessoa{
	private String materia;
	private int a;
	
	public Prof(){
		String materia = "";
		int a = 0;
	}
	
	public String getMateria(){
		return materia;
	}
	public int getA(){
		return a;
	}
	
	public void setMateria(String materia){
		this.materia = materia;
	}
	public void setA(int a){
		this.a = a;
	}
}