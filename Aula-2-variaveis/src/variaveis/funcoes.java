package variaveis;

import java.util.Scanner;

public class funcoes {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a temperatura em celsius: ");
		double celsius = sc.nextDouble();
		
		double fahrenheit = ( celsius * 9/5 ) + 32;
		
		double kelvin = celsius + 273.15;
		
		System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
		
		System.out.println("A temperatura em Kelvin é: " + kelvin);
		
		sc.close();
		
		
		 
        
        
        
        
        
        
        
	}

}
