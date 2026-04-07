public class Ex1 {
    	public static void main(String args[]){

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		soma(a,b);
        sub(a,b);
        mult(a,b);
        div(a,b);

	}
	
	public static void soma(int x, int y){
		int z = x + y;
		System.out.println("Soma: " + z);	
	}
    public static void sub(int v, int w){
		System.out.println("Subtracao: " + (v-w));	
	}
    public static void mult(int c, int d){
		int g = c * d;
		System.out.println("Multiplicacao: " + g);	
	}
    public static void div(int e, int f){
		System.out.println("Divisao: " + (e/f));	
	}
}
