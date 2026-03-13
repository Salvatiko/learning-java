public class EntDados{

	public static void main(String args[]){
		
		float a = 2.999f; 
		int c = (int) a; //casting altera o comportamento da variavel sem alteração
		System.out.println("\nEntrada de Dados: "+ c);
		
		/* Warapper> envelopamento de tipos:
		Integer.parseInt(Str) -> converte uma string para int*/
		
		int b = Integer.parseInt(args[0]);
		int d = b;
		System.out.println("\nEntrada de Dados: "+ d);

	
	}
}