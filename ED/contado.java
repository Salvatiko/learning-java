public class Contado{
	protected int count;
	Contado(){count = 0;}
	public int getCount(){return count;}
	public void incrementCount (){ count++; }
	public void decrementCount (){ count--; }
	
	public static void main(String [] args) {
		Contado contador1 = new Contado();
		int retorno = contador1.getCount();
		System.out.println(retorno);
	}
	
}