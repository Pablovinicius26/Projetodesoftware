package estruturascondicionais;

import java.util.Scanner;

public class compras {

	public static void main(String[] args) {
		//Switch Case
		//Máquina de Cartão
		
		// Método de pagamento
		//		1 - Dinheiro/Pix - 10%
		//		2 - Débito - 5%
		//		3 - Crédito - Valor total
		
		// Valor da compra
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o valor da sua compra R$: ");
		double valorCompra = sc.nextDouble();
		
		System.out.println("Métodos de Pagamento");
		System.out.println("1 - Dinheiro/Pix");
		System.out.println("2 - Débito");
		System.out.println("3 - Crédito");

		int metodopagamento = sc.nextInt();
		
		switch(metodopagamento) {
			
			case 1:
				double valorFinal = valorCompra * 0.9;
				System.out.println("Sua compra ficou R$" + valorFinal);
				break;
			case 2:
				valorFinal = valorCompra * 0.95;
				System.out.println("Sua compra ficou R$" + valorFinal);
				break;
			case 3:
				System.out.println("Método de Parcelamento");
				System.out.println("1 - A vista");
				System.out.println("2 - 2x com 5% de juros");
				System.out.println("3 - 3x com 10% de juros");
				int metodoparcelamento = sc.nextInt();
				
					switch(metodoparcelamento) {
						case 1:
							valorFinal = valorCompra;
							System.out.println("Sua compra ficou R$" + valorCompra);
							break;
						case 2:
							valorFinal = valorCompra * 1.05;
							System.out.println("Sua compra ficou R$" + valorFinal);
							break;
						case 3:
							valorFinal = valorCompra * 1.1;
							System.out.println("Sua compra ficou R$" + valorFinal);
							break;
						default:
							System.out.println("Opção Inválida");
							break;
						
						
				
				}
				

		

		}
		
	
	}

}
