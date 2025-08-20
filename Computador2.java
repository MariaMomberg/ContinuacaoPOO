package aula3;

public class Computador2 {

	public static void main(String[] args) {
		Computador computador = new Computador();

		computador.setArmazenamento("Tem 512Gb de armazenamento");
		computador.setProcessador("O processador é: Intel core i5");
		computador.setMouse("O tipo de mouse é: Logitech G Pro X Superlight");
		computador.setPlacavideo("A placa de vídeo é: NVIDIA GTX 1660 Super");
		computador.setMemoriaram("A memória ram é: HyperX Fury");
		computador.setSistemaoperacional("O sistema operacional é: Microsoft Windows");
		computador.setTeclado("O teclado é: Logitech MK235");
		
		System.out.println("Computador");
		System.out.println(computador.getArmazenamento());
		System.out.println(computador.getProcessador());
		System.out.println(computador.getMouse()); 
		System.out.println(computador.getMemoriaram());
		System.out.println(computador.getSistemaoperacional());
		System.out.println(computador.getTeclado());  
		
		computador.ligar();
		computador.atualizar();
		computador.reiniciar();
		computador.desligar();
	}
}
