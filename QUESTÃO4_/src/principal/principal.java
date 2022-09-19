package principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		// // 4. Faça um programa que receba o salário de um funcionário , calcule e mostre o novo salário , sabendo - se que este sofreu um aumento de 25 %.
		Scanner salario = new Scanner(System.in);
		float salario1;
		float aumento;
		float res;
		
		System.out.println("Digite seu salário:");
		salario1 = salario.nextFloat();
		res = (salario1*25)/100;
		aumento = (res+salario1);
		System.out.println("Seu novo salário com aumento de 25% é:"+aumento);

	}

}
