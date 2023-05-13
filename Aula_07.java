package aulas;
//lembrar de importar o java.util.scanner para ler coisas.
import java.util.Scanner;
public class Aula_07{
	public static void main (String[] args ) {
		Scanner ler = new Scanner(System.in);
		 int x;
		 double preço;
		 String palavra;
		 String frase;
		 
		 System.out.printf("Digite seu nome! ");
		 frase = ler.nextLine();
		 
		 
		 System.out.printf("Digite sua idade! ");
		 x = ler.nextInt();
		  
		 
		 System.out.println("Seu nome é "+ frase + " e sua idade é " + x);
		 
		 
	}
}