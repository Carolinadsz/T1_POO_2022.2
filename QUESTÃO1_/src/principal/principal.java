package principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		//// 1. Faça um programa que receba quatro números inteiros, calcule e mostre a soma desses números
		Scanner geral = new Scanner(System.in);
		System.out.println("Insira o primeiro número: ");
		int n1 = geral.nextInt();
		System.out.println("Insira o segundo número: ");
		int n2 = geral.nextInt();
		System.out.println("Insira o terceiro número: ");
		int n3 = geral.nextInt();
		System.out.println("Insira o quarto número: ");
		int n4 = geral.nextInt();
		
		int soma = (n1+n2+n3+n4);
		System.out.println(soma);
		}}
