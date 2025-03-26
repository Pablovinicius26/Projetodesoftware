package estruturada;

public class contames {

	public static void main(String[] args) {
		//Estruturada
		double janAlim, janAgua, janLuz, fevAlim, fevAgua, fevLuz;
		
		//Gastos Janeiro
		janAlim = 1000;
		janAgua = 300;
		janLuz = 300;
		
		//Gastos Fevereiro
		fevAlim = 1500;
		fevAgua = 300;
		fevLuz = 300;
		
		//Gasto total
		double gastoTotalJan = janAlim + janAgua + janLuz;
		double gastoTotalFev = fevAlim + fevAgua + fevLuz;
		
		if (gastoTotalJan > gastoTotalFev) {
			System.out.println("O gasto de janero foi maior");
		}
		
		else if (gastoTotalFev > gastoTotalJan) {
			System.out.println("O gasto de fevereiro foi maior");
		}
		else {
			System.out.println("Ambos os meses tiveram o mesmo gasto");
		}

	}

}
