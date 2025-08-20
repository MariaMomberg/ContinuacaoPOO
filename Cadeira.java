package aula3;

public class Cadeira {
String material;
String cor;
String possuirodas;
String apoiobraco;
String regulagemaltura;
public String getMaterial() {
	return material;
}
public void setMaterial(String material) {
	this.material = material;
}
public String getCor() {
	return cor;
}
public void setCor(String cor) {
	this.cor = cor;
}
public String getPossuirodas() {
	return possuirodas;
}
public void setPossuirodas(String possuirodas) {
	this.possuirodas = possuirodas;
}
public String getApoiobraco() {
	return apoiobraco;
}
public void setApoiobraco(String apoiobraco) {
	this.apoiobraco = apoiobraco;
}
public String getRegulagemaltura() {
	return regulagemaltura;
}
public void setRegulagemaltura(String regulagemaltura) {
	this.regulagemaltura = regulagemaltura;
	
}
public void girar() {
System.out.println("A cadeira está girando!");
}
public void reclinar() {
System.out.println("A cadeira reclinou");
}
public void ajustarAltura(int altura) {
	System.out.println("A cadeira foi ajustada " + altura + " centímetros");
}
public void mover() {
	System.out.println("A cadeira moveu!");
}
}

