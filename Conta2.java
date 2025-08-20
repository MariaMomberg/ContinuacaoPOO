package aula3;

public class Conta2 {

	public static void main(String[] args) {
		Conta conta = new Conta();

		conta.setId(04);
		conta.setSaldo(6000);
		conta.setTipo("Corrente");

		System.out.println("ID: " + conta.id);
		System.out.println("Tipo: " + conta.tipo);
		System.out.println("Saldo: R$ " + conta.saldo);

		
		conta.sacar(700);
		conta.depositar(200);
		conta.consultarHistórico("3 ");
		conta.sair();
	}

}