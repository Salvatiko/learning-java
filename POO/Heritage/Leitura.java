import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Leitura{
	
	private static Leitura leiUnic; //1º passo
	
	private Leitura(){ //2º passo
	}
	
	public static Leitura geraLeitura(){ //3º passo: 
		if(leiUnic == null){
			leiUnic = new Leitura();
		}
		return leiUnic;
	} 	

	public static String entDados(String rotulo){
		
		System.out.println(rotulo);
		
		InputStreamReader tec = new InputStreamReader(System.in);
		BufferedReader buff = new BufferedReader(tec);
		
		String ret = "";
		
		try{
			ret = buff.readLine();			
		}
		catch(IOException ioe){
			System.out.println("\n Erro de Entrada de Dados");
		}
		return ret;		
	}
	
}




