package principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		// // 11. Faça um programa que receba um número positivo e maior que zero.
		System.out.println("Escreva um número:");
		Scanner num = new Scanner(System.in); 
		
		float numero;
		numero = num.nextFloat(); 
		float quadrado = 2;
		float cubica = 3; 
		
		System.out.println(""+numero+" Elevado ao quadrado é igual a: " + Math.pow(numero,quadrado));
		System.out.println(""+numero+" Elevado ao cubo é igual a: " + Math.pow(numero,cubica));
		System.out.println("A raiz quadrada de "+numero+" é: " + Math.sqrt(numero));
		System.out.println("A raiz cúbica de "+numero+" é: " + Math.cbrt(numero));

	}

}
