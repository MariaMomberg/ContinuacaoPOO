package aula3;

public class Computador {
String armazenamento;
String processador;
String mouse;
String placavideo;
String memoriaram;
String sistemaoperacional;
String teclado;
public String getTeclado() {
	return teclado;
}
public void setTeclado(String teclado) {
	this.teclado = teclado;
}
public String getArmazenamento() {
	return armazenamento;
}
public void setArmazenamento(String armazenamento) {
	this.armazenamento = armazenamento;
}
public String getProcessador() {
	return processador;
}
public void setProcessador(String processador) {
	this.processador = processador;
}
public String getMouse() {
	return mouse;
}
public void setMouse(String mouse) {
	this.mouse = mouse;
}
public String getPlacavideo() {
	return placavideo;
}
public void setPlacavideo(String placavideo) {
	this.placavideo = placavideo;
}
public String getMemoriaram() {
	return memoriaram;
}
public void setMemoriaram(String memoriaram) {
	this.memoriaram = memoriaram;
}
public String getSistemaoperacional() {
	return sistemaoperacional;
}
public void setSistemaoperacional(String sistemaoperacional) {
	this.sistemaoperacional = sistemaoperacional;
}
public void ligar() {
System.out.println("O computador está ligado");
}
public void atualizar() {
	System.out.println("O computador está atualizando");
}
public void reiniciar() {
	System.out.println("O computador reiniciou");
}
public void desligar() {
	System.out.println("O computador desligou");
}
}
