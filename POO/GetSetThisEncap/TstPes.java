public class TstPes{

	public static void main(String arg[]){ //classLoader
	
		Pessoa p1 = new Pessoa();
		Leitura l = new Leitura();	

		p1.setCpf(Integer.parseInt(l.entDados("\nCPF..: ")));
		p1.setNome(l.entDados("NOME..: "));
		
		p1.getEnder().setRua("Minas Gerais"); //Reflexividade
		p1.getEnder().setNum(1297);//Reflexividade
		
		
		System.out.println("\nCPF.: "+ p1.getCpf()); 
		System.out.println("NOME.: " + p1.getNome()); 
		System.out.println("\nRUA.: "+ p1.getEnder().getRua());
		System.out.println("NUMERO.: "+ p1.getEnder().getNum());		

	}


}