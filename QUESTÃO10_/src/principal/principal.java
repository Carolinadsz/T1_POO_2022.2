package principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		// // 10. Faça um programa que calcule e mostre a área de um círculo . Sabe - se que : Área = π R².
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o raio do círculo: ");
		  double raio = sc.nextDouble();
		double pi = 3.14;
		double area = pi * Math.pow(raio,2);
        System.out.format("A área do círculo é %.2f ",area);

	}

}
