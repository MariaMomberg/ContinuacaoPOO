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
public void acessar(int identidade) {
	System.out.println("O usuário " + identidade + " acessou");
}
public void fornecerCnpj() {
	System.out.println("O usuário forneceu o cnpj");
}
public void fornecerEndereco() {
	System.out.println("O endereço foi fornecido");
}
public void fornecerInscricaoEstadual() {
	System.out.println("A inscrição estadual foi fornecida");
}
}
