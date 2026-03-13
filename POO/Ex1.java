public class Ex1{

	public static void main(String args[]){

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		soma(a,b);

	}
	
	public static void soma(int x, int y){
		int z = x + y;
		System.out.println("Soma: " + z);	
	}
	
}