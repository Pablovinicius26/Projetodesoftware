package exemplo;

public class carro {
	//Atributos
	double motor;
	String fabricante;
	String modelo;
	int ano;
	String placa;
	String Cor;
	int velocidade;
	
	public void exibirInfo() {
		System.out.println(
				"Fabricante: " + fabricante +
				"\nModelo: " + modelo +
				"\nCor: " + Cor +
				"\nAno: " + ano +
				"\nPlaca: " + placa +
				"\nMotor: " + motor +
				"\nVelocidade: " + velocidade
				);
	}
	
	public void acelera(int vel) {
		velocidade = velocidade + vel;
	}
	
	public void freia(int fre) {
		velocidade = velocidade - fre;
	}
		
}
