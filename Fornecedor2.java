package aula3;

public class Fornecedor2 {

	public static void main(String[] args) {
		Fornecedor fornecedor = new Fornecedor();
		
		fornecedor.setId(200);
		fornecedor.setRazaoSocial("Indústria e Comércio TechNova LTDA");
		fornecedor.setNomeFantasia("TechNova");
		fornecedor.setCnpj("12.345.678/0001-99");
		fornecedor.setEndereco("Avenida das Palmeiras, 450 - Jardim América, São Paulo - SP");
		fornecedor.setFone("(11) 98765-4321");
		fornecedor.setEmail("technova1418@gmail.com");
		fornecedor.setInscricaoEstadual("502.388.153.753");
		
		System.out.println("Fornecedor");
		System.out.println(fornecedor.getId());
		System.out.println(fornecedor.getRazaoSocial());
		System.out.println(fornecedor.getNomeFantasia()); 
		System.out.println(fornecedor.getCnpj());
		System.out.println(fornecedor.getEndereco());
		System.out.println(fornecedor.getFone());
		System.out.println(fornecedor.getEmail());
		System.out.println(fornecedor.getInscricaoEstadual());  
		
		fornecedor.fornecerProduto("Fornecer mouse");
		fornecedor.atualizarEndereco("Bairro Castelo, 153 - Campo Grande - MS");
		fornecedor.enviarEmail("Seu pacote está a caminho");
		fornecedor.mostrarContato();
}
}

