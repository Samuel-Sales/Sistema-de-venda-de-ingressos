package Mapa;
import java.util.ArrayList;
import java.util.List;
public class Evento extends Ingresso {
	private String nomeEvento;
	private String data;
	private double valorUnico;
	private int capacidadeMaxima;
	private int ingressosVendidos = 0;
	private List<IngressoPista> ingressoVendidoPista = new ArrayList<IngressoPista>();
	private List<IngressoVip> ingressoVendidoVip = new ArrayList<IngressoVip>();
	private List<IngressoCamarote> ingressoVendidoCamarote = new ArrayList<IngressoCamarote>();
	

	public Evento() {
		
	}
	
	public Evento(String nomeEvento, String data, double valorUnico, int capacidadeMaxima) {
		this.nomeEvento = nomeEvento;
		this.data = data;
		this.valorUnico = valorUnico;
		this.capacidadeMaxima = capacidadeMaxima;
	}
	
	public List<IngressoPista> getIngressoVendidoPista() {
		return ingressoVendidoPista;
	}

	public void setIngressoVendidoPista(List<IngressoPista> ingressoVendidoPista) {
		this.ingressoVendidoPista = ingressoVendidoPista;
	}

	public List<IngressoVip> getIngressoVendidoVip() {
		return ingressoVendidoVip;
	}

	public void setIngressoVendidoVip(List<IngressoVip> ingressoVendidoVip) {
		this.ingressoVendidoVip = ingressoVendidoVip;
	}

	public List<IngressoCamarote> getIngressoVendidoCamarote() {
		return ingressoVendidoCamarote;
	}

	public void setIngressoVendidoCamarote(List<IngressoCamarote> ingressoVendidoCamarote) {
		this.ingressoVendidoCamarote = ingressoVendidoCamarote;
	}
	
	
	
	public int getIngressosVendidos() {
		return ingressosVendidos;
	}

	public void setIngressosVendidos(int ingressosVendidos) {
		this.ingressosVendidos = ingressosVendidos;
	}

	public String getNomeEvento() {
		return nomeEvento;
	}
	public void setNome(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public double getValorUnico() {
		return valorUnico;
	}
	public void setValorUnico(double valorUnico) {
		this.valorUnico = valorUnico;
	}
	public int getCapacidadeMaxima() {
		return capacidadeMaxima;
	}
	public void setCapacidadeMaxima(int capacidadeMaxima) {
		this.capacidadeMaxima = capacidadeMaxima;
	}
	
	//Metodos
	public String imprimirValorIngresso(int getValorUnico) {
		switch (getValorUnico) {
		case 1:
			System.out.printf("Valor do ingresso PISTA: R$ %.2f", getValorUnico());
			System.out.println();
		break;
		case 2:
			System.out.printf("Valor do ingresso VIP: R$ %.2f", getValorUnico() * 1.3);
			System.out.println();
		break;
		case 3:
			System.out.printf("Valor do ingresso CAMAROTE: R$ %.2f", getValorUnico() * 1.6);
			System.out.println();
		break;
		default:
			return "";
		}
		return null;
	}
	
	public String vendaDeIngressos(Ingresso ingresso, int getTipoIngresso) {
		
		if (getIngressosVendidos() < getCapacidadeMaxima()) {
			
			switch(getTipoIngresso) {
			case 1:
				this.ingressoVendidoPista.add((IngressoPista) ingresso);
				System.out.printf("Vendido ingresso PISTA: R$ %.2f", getValorUnico());
				System.out.println();
			break;
			case 2:
				this.ingressoVendidoVip.add((IngressoVip) ingresso);
				System.out.printf("Vendido ingresso VIP: R$ %.2f", getValorUnico() * 1.3);
				System.out.println();
			break;
			case 3:
				this.ingressoVendidoCamarote.add((IngressoCamarote) ingresso);
				System.out.printf("Vendido ingresso CAMAROTE: R$ %.2f", getValorUnico() * 1.6);
				System.out.println();
			break;
			default:
				System.out.println("Comando invalido!!");
			}
			setIngressosVendidos(getIngressosVendidos() + 1);
		}else {
			System.out.println("O show esta lotado.....");
		}
		
		return "";
	}
	
	public void dadosDoEvento() {
		System.out.println("Nome do evento: "+ getNomeEvento());
		System.out.println("Data do evento: "+ getData());
	}
	
	public String toString() {
		return "=========== DADOS DO EVENTO ===========\n"+ getNomeEvento() + "\n"+ "Data: "+ getData();
	}
	
	
	
	
}
