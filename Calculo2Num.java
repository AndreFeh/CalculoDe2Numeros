package git;
import java.util.Scanner;

public class Calculo2Num {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
			
			System.out.println("Primeiro numero a ser somado: ");
				int soma1 = scan.nextInt();
				
				System.out.println("Agora o segundo: ");
					int soma2 = scan.nextInt();
					
					int resultado = soma1 + soma2;
				
					System.out.println("O resultado final é: " + soma1 + " + " + soma2 + " = " + resultado);
	}

}
