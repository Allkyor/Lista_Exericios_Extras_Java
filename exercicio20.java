package aulas;
import java.util.Scanner;
public class Das {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int num = 0;
		double divi = 0;
		char operador;
		System.out.println("Insira um número de 0 a 9.");
		num = a.nextInt();
		if (num >= 0 && num <= 9) {
			System.out.println("Insira o operador.");
			operador = a.next().charAt(0);
			switch (operador) {
			case '+':
				for (int i = 0; i <= 10; i++) {
					System.out.println(num + " + " + i + " = " + (num + i));
				}
				break;
			case '-':
				for (int i = 0; i <= 10; i++) {
					System.out.println(num + " - " + i + " = " + (num - i));
				}
				break;
			case '*':
				for (int i = 0; i <= 10; i++) {
					System.out.println(num + " * " + i + " = " + (num * i));
				}
				break;
			case '/':
				if (!(num == 0)) {
					divi = num;
					for (int i = 1; i <= 10; i++) {
						System.out.println(divi + " / " + i + " = "+ (divi / i));
					}
				}
				break;
			default:
				System.out.println("Operador invalido.");
				break;
			}
		} else {
			System.out.println("Número invalido.");
		}
		a.close();
	}

}
