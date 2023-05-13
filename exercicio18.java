package aulas;
import java.util.Scanner;
public class exercicio18 {
	public static void main(String[] arg) {
		    Scanner ler = new Scanner(System.in);
			double baseMaior, baseMenor, altura, area;
			
			System.out.println("Digite a base maior do trapézio");
			baseMaior = ler.nextDouble();
			System.out.println("Digite a base menor do trapézio");
			baseMenor = ler.nextDouble();
			System.out.println("Digite a altura do trapézio");
			altura = ler.nextDouble();
			area = (((baseMaior + baseMenor)/2)*altura);
			System.out.println("A área do trapézio é: "+ area);
			ler.close();		
	}
}
