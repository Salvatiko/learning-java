import java.util.Scanner;

public class entDados {
    public static void main(String args[]){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int a = entrada.nextInt();

        System.out.println("Digite o segundo numero: ");
        int b = entrada.nextInt();

        entrada.close();

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

