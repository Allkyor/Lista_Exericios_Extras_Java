package aulas;
import java.util.Scanner;
public class exercicio15 {
	public static void main(String[] arg) {
		Scanner ler = new Scanner(System.in);
			float peso1, peso2, peso3;
				System.out.println("Digite seu peso!");
				peso1 = ler.nextFloat();
				System.out.println("Digite o peso de seu amigo");
				peso2 = ler.nextFloat();
				System.out.println("Digite o peso de outro amigo");
				peso3 = ler.nextFloat();
				
				System.out.printf("O peso de vocês somados é de " + (peso1 + peso2 + peso3));
				
			ler.close();	
		}
	
	}


