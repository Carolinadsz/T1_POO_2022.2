package principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		// // 19. Cada degrau de uma escada tem X de altura . Faça um programa que receba essa altura e a altura que o usuário deseja alcançar subindo a escada . Calcule e mostre quantos degraus o usuário deverá subir para atingir seu objetivo , sem se preocupar com a altura do usuário . alcançar .
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva a altura do degrau: ");
		  float aDegrau = sc.nextInt();
		System.out.println("Escreva a altura desejada: ");
		  float aUsuario = sc.nextInt();
		float qtdDegraus = aUsuario / aDegrau;
	    System.out.println("Para alcançar" + aUsuario + ", você precisa subir " + qtdDegraus + " degraus!");

	}

}
