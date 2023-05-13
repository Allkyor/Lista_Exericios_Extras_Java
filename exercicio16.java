package aulas;
import java.util.Scanner;
public class exercicio16 {
	public static void main(String[] arg) {
	       Scanner ler = new Scanner(System.in); 
			float nota1, nota2;
			System.out.println("Digite sua primeira nota");
			nota1 = ler.nextFloat();
			System.out.println("Digite sua segunda nota");
			nota2 = ler.nextFloat();
			System.out.println("Sua média é de "+ ((nota1+nota2)/2) );			
			ler.close();
			
	}
}
