package com.mycompany.desafioscanner;

import java.util.Scanner;
/**
 *
 * @author v
 */
public class DesafioScanner {
	public static void main(String[] args) {		
		Scanner userValues = new Scanner(System.in);
		System.out.print("Insira o primeiro salário: ");
									
		double read1 = userValues.nextDouble();
		System.out.print("Insira o segundo salário: ");
		double read2 = userValues.nextDouble();
		System.out.print("Insira o terceiro salário: ");
		double read3 = userValues.nextDouble();
		
		double result = read1 + read2 + read3;               
               
		System.out.print("Sua média salarial é: " + result / 3);
			
	}
}

// Agradecimentos a Erlison por me orientar no problema 