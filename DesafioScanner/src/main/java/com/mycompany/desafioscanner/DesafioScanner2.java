package com.mycompany.desafioscanner;

import java.util.Scanner;
/**
 *
 * @author v
 */
public class DesafioScanner2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o primeiro salário: ");
        String value1 = entrada.next().replace("," , ".");
        
        System.out.print("Informe o segundoo salário: ");
        String value2 = entrada.next().replace("," , ".");
        
        System.out.print("Informe o terceiro salário: ");
        String value3 = entrada.next().replace("," , ".");
        
        double salario1 = Double.parseDouble(value1);
        double salario2 = Double.parseDouble(value2);
        double salario3 = Double.parseDouble(value3);
        
        double media = (salario1 + salario2 + salario3) / 3;
        System.out.println("A média dos salários é " + media);
        
        entrada.close();
        
    }
}
