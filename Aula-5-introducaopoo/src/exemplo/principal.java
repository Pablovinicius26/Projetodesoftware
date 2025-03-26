package exemplo;

public class principal {

	public static void main(String[] args) {
			
		carro civic = new carro();

		civic.fabricante = "Honda";
		civic.modelo = "Civic";
		civic.motor = 2.0;
		civic.placa = "MOR-2451";
		civic.Cor = "Rosa";
		civic.ano = 2024;
		civic.velocidade = 0;
		civic.acelera(10);
		civic.acelera(20);
		civic.freia(5);
		civic.exibirInfo();
		
		System.out.println();
		
		carro celta = new carro();
		celta.fabricante = "Chevrolet";
		celta.modelo = "Celta";
		celta.motor = 1.0;
		celta.placa = "PVM-2612";
		celta.Cor = "Preto";
		celta.ano = 2015;
		celta.velocidade = 0;
		celta.exibirInfo();
		
		
		carro gol = new carro();
		gol.fabricante = "Wolkswagem";
		gol.modelo = "Gol G5";
		gol.motor = 1.0;
		gol.placa = "GOL-2010";
		gol.Cor = "Vermelho";
		gol.ano = 2010;
		gol.velocidade = 0;
		gol.exibirInfo();
		
		

	}

}
