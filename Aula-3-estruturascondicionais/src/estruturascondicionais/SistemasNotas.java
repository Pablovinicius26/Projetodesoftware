package estruturascondicionais;

import java.util.Scanner;

public class SistemasNotas {

	public static void main(String[] args) {
		// Calcule a média de um aluno e diga se ele foi:
		//		- Aprovado - 7 a 10
		//		- Recuperação - 5 a 6.9
			//			- Aprovado - 7 a 10
			//			- Reprovado - 0 a 6.9
		//		- Reprovado - 0 a 4.9
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		double nota1 = sc.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		double nota2 = sc.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		System.out.println("A sua media foi de: " + media);
		
		if (media >= 7) {
			System.out.println("Aprovado");	
		}
		else if(media >= 5) {
			// Recuperação
			System.out.println("Recuperação");
			System.out.print("Digite a nota do seu exame:");
			
			double notaexame = sc.nextDouble();
			
			double exame = (media + notaexame) / 2;
			System.out.println("A sua media foi de: " + media);
			
			if (exame > 6.9) {
				System.out.println("Aprovado");
			}
			else {
				System.out.println("Reprovado novamente");
			}
		}
		else {
			System.out.println("Reprovado");
		}
		
		sc.close();

	}

}
