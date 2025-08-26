package aula3;

public class Fornecedor {
int id;
String RazaoSocial;
String NomeFantasia;
String cnpj;
String endereco;
String fone;
String email;
String InscricaoEstadual;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getRazaoSocial() {
	return RazaoSocial;
}
public void setRazaoSocial(String razaoSocial) {
	RazaoSocial = razaoSocial;
}
public String getNomeFantasia() {
	return NomeFantasia;
}
public void setNomeFantasia(String nomeFantasia) {
	NomeFantasia = nomeFantasia;
}
public String getCnpj() {
	return cnpj;
}
public void setCnpj(String cnpj) {
	this.cnpj = cnpj;
}
public String getEndereco() {
	return endereco;
}
public void setEndereco(String endereco) {
	this.endereco = endereco;
}
public String getFone() {
	return fone;
}
public void setFone(String fone) {
	this.fone = fone;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getInscricaoEstadual() {
	return InscricaoEstadual;
}
public void setInscricaoEstadual(String inscricaoEstadual) {
	InscricaoEstadual = inscricaoEstadual;
}
public void fornecerProduto(String produto) {
        System.out.println("O fornecedor " + nomeFantasia + " fornece: " + produto);
    }

    public void atualizarEndereco(String novoEndereco) {
        this.endereco = novoEndereco;
        System.out.println("Endereço alterado para: " + novoEndereco);
    }

    public void enviarEmail(String mensagem) {
        System.out.println("Enviando email para " + email + ": " + mensagem);
    }

    public void mostrarContato() {
        System.out.println("Contato do fornecedor " + nomeFantasia + ": " + fone + " | " + email);
}
}

