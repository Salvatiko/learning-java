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
		contador1.incrementCount();
		retorno = contador1.getCount();
		System.out.println(retorno);
		contador1.decrementCount();
		contador1.decrementCount();
		retorno = contador1.getCount();
		System.out.println(retorno);
	}
	
}