package Mapa;

public class Ingresso {
	private String nomeCliente;
	private String CPF;
	private String eventoRelacionado;
	
	public Ingresso() {
		
	}
	
	public Ingresso(String nomeCliente, String CPF, String eventoRelacionado) {
		this.nomeCliente = nomeCliente;
		this.CPF = CPF;
		this.eventoRelacionado = eventoRelacionado;
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
	public String getEventoRelacionado() {
		return eventoRelacionado;
	}
	public void setEventoRelacionado(String eventoRelacionado) {
		this.eventoRelacionado = eventoRelacionado;
	}
	
	//Metodo
	public void resumo() {
		System.out.println("Nome: "+ getNomeCliente());
		System.out.println("CPF: "+ getCPF());
		
	}
	
	
	
	
	
	
	
}
