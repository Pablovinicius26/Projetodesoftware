package poo;

public class principal {

	public static void main(String[] args) {
		
		contamespoo janeiro = new contamespoo ();
		contamespoo fevereiro = new contamespoo ();
		
		//Gastos Janeiro
		janeiro.agua = 300;
		janeiro.alimentacao = 1200;
		janeiro.luz = 300;
		
		//Gastos Fevereiro
		fevereiro.agua = 300;
		fevereiro.alimentacao = 1200;
		fevereiro.luz = 300;
		
		//Gasto Total
		double gastoJan = janeiro.somaGasto();
		double gastoFev = fevereiro.somaGasto();
		
		if (gastoJan > gastoFev) {
			System.out.println("O gasto em Janeiro foi Maior");
		}
		else if (gastoFev > gastoJan) {
			System.out.println("O gasto de Fevereiro foi Maior");
		}
		else {
			System.out.println("Ambos os meses tiveram o mesmo gasto");
		}
	}

}
