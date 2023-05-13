package aulas;
import java.util.Scanner;
public class exercicio05 {
	public static void main(String[] arg) {
		//programa curto que imprime meu nome, idade e pergunta se sou brasileiro
		Scanner ler = new Scanner(System.in);
		String Nome;
		int Idade;
		boolean Brasileiro = true ;
		String Resposta;
		
		Nome = "Allyson Rodrigues de Oliveira";
		Idade = 24;
		
		System.out.println(Nome);
		System.out.println(Idade);
		System.out.println("|Ele é Brasileiro?|");
		System.out.println("|  Sim  |  Não    |");
		Resposta = ler.nextLine();
		if (Resposta.equals("Sim")) {
			System.out.println(Brasileiro);
		} else {
			System.out.println("Errado");	
		}
		ler.close();
		
		
		
		
	}

}
