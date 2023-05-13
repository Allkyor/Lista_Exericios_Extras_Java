package aulas;
import java.util.Scanner;
public class Favip01 {
	public static void main(String[] args) {

		System.out.println("Informe o n�mero.");
		Scanner l = new Scanner(System.in);
		char a;
		int total = 0;
		a = l.next().charAt(0);
		int i = a - 48;
		total = (i * 5481) - 2987;

		System.out.println("Total de " + total);
		l.close();
	}

}
