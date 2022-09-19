package principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		// // 2. Faça um programa que receba três notas , calcule e mostre a média aritmética entre elas.
		java.util.Scanner nota = new Scanner(System.in); 
		float n1,n2,n3,n4,mf; 
        System.out.println("Digite a sua nota da N1:");
	    n1 = nota.nextFloat ( ); 
	    System.out.println("Digite a sua nota da N2:");
	    n2 = nota.nextFloat( );
	    System.out.println("Digite sua nota da N3:");
	    n3 = nota.nextFloat( ); 
	    mf = (n1 + n2 + n3)/3; 
	    System.out.println("Sua nota é:" + mf);

	}

}
