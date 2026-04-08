public class TstHer{

	public static void main(String arg[]){ //classLoader
	
		Aluno a1 = new Aluno();
		Prof p1 = new Prof();
		
		p1.setA(24); //Prof
		p1.setMateria("Fisica 1");// prof
		a1.setRa(1909207);//aluno
		a1.setCurso("ADS");//aluno
		
		p1.setCpf(42); // Pessoa
		p1.setNome("Carlito Alex Argentina"); //Pessoa
		a1.setCpf(25); // Pessoa
		a1.setNome("Luis Augusto");// Pessoa
		
		a1.getEnder().setRua("Das Calendulas"); // Pessoa - reflex
		a1.getEnder().setNum(7); // Pessoa - reflex
		p1.getEnder().setRua("Do Rocio"); // Pessoa - reflex
		p1.getEnder().setNum(583); // Pessoa - reflex
		
		System.out.println("\n RA..: a"+ a1.getRa());
		System.out.println(" CURSO..: " + a1.getCurso());
		System.out.println("\n RUA..: "+ a1.getEnder().getRua()); //Reflex
		System.out.println("NUMERO: "  + a1.getEnder().getNum()); //Reflex
		
		System.out.println("\n MATERIA..: "+ p1.getMateria());
		System.out.println(" NUM..: " + p1.getA());
		System.out.println("\n RUA..: "+ p1.getEnder().getRua()); //Reflex
		System.out.println("NUMERO: "  + p1.getEnder().getNum()); //Reflex
	

	}


}