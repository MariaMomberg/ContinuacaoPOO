package aula3;

public class Cadeira2 {
	public static void main(String[] args) {
		Cadeira cadeira = new Cadeira(); 
		
		cadeira.setMaterial("O material é polipropileno");
		cadeira.setCor("A cor é preta");
		cadeira.setPossuirodas("Possui rodas");
		cadeira.setApoiobraco("Possui apoio braço");
		cadeira.setRegulagemaltura("Possui regulagem de altura");
		
		System.out.println("Cadeira");
		System.out.println(cadeira.getMaterial());
		System.out.println(cadeira.getCor());
		System.out.println(cadeira.getPossuirodas());
		System.out.println(cadeira.getApoiobraco());
		System.out.println(cadeira.getRegulagemaltura());
		
		cadeira.girar();
		cadeira.ajustarAltura(20);
		cadeira.reclinar();
		cadeira.mover();
	}
}
		
		
		
		

