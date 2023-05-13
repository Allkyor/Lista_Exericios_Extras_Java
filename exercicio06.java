package aulas;
import java.util.Scanner;
public class exercicio06 {
	public static void main(String[] arg) {
		Scanner ler = new Scanner(System.in);
			char estadoCivil;			
			System.out.println("Qual seu Estado Civil?");
			System.out.println("s- Solteiro(a) | c- Casado(a)");
			System.out.println("v- Viúvo(a)    | u- União estável");
			estadoCivil = ler.next().charAt(0);
			switch(estadoCivil){
				case 's' -> System.out.println("Seu estado Civil é Solteiro(a)");
				case 'c' -> System.out.println("Seu estado Civil é Casado(a)");
				case 'v' -> System.out.println("Seu estado Civil é Viúvo(a)");
				case 'u' -> System.out.println("Seu estado Civil é União estável");
			
				default -> System.out.println("VALOR INVALIDO.");
			} 
		
		ler.close();
	}
}
