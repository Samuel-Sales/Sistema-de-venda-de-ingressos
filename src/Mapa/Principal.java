package Mapa;
import java.util.Locale;
public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		//Criando o evento
		Evento evento = new Evento("Green Day", "10/10/2022", 50.00, 100);
		
		//Criando os ingressos
		System.out.println("=========== CRIAÇÃO DE INGRESSOS ===========");
		Ingresso ingresso1 = new IngressoPista("Samuel", "777.777.777-77");
		ingresso1.resumo();
		evento.imprimirValorIngresso(1);
		evento.dadosDoEvento();
		System.out.println("");
		
		Ingresso ingresso2 = new IngressoVip("Gabriella", "111.111.111-11");
		ingresso2.resumo();
		evento.imprimirValorIngresso(2);
		evento.dadosDoEvento();
		System.out.println("");
		
		Ingresso ingresso3 = new IngressoCamarote("Suzana", "222.222.222-22");
		ingresso3.resumo();
		evento.imprimirValorIngresso(3);
		evento.dadosDoEvento();
		System.out.println("==============================================");
		
		
		System.out.println("=========== VENDA DE INGRESSOS ===========");
		evento.vendaDeIngressos(ingresso1, 1);
		evento.vendaDeIngressos(ingresso2, 2);
		evento.vendaDeIngressos(ingresso3, 3);
		System.out.println("==============================================");
		
		System.out.println("=========== QUANTIDADE DE INGRESSOS VENDIDOS ===========");
		System.out.println("Ingressos vendidos: "+ evento.getIngressosVendidos());
		System.out.println("==============================================");
		
		System.out.println(evento.toString());
		
		
	}

}
