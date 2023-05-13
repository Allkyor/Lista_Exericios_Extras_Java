package aulas;
import java.util.Scanner;
public class exercicio17 {
	public static void main(String[] arg) {
			Scanner ler = new Scanner(System.in);
			float peso, altura;
			
			System.out.println("Digite sua altura!");
			altura = ler.nextFloat();
			System.out.println("Digite seu peso!");
			peso = ler.nextFloat();
			System.out.println("Seu IMC é de: "+ (peso / (altura *altura)));
			ler.close();
			
	}
}
