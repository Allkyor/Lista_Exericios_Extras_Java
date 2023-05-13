package aulas;
import java.util.Scanner;
public class testes {
	public static void main(String[] args) {
		String n = null;
		char letra;
		Scanner a = new Scanner(System.in);
		System.out.println("Insira o número telefonico.");
		n = a.next();
		for (int j = 0; j < n.length(); j++) {
			letra = n.charAt(j);
			switch (letra) {
			case 65:
			case 66:
			case 67:
				System.out.printf("2");
				break;
			case 68:
			case 69:
			case 70:
				System.out.printf("3");
				break;
			case 71:
			case 72:
			case 73:
				System.out.printf("4");
				break;
			case 74:
			case 75:
			case 76:
				System.out.printf("5");
				break;
			case 77:
			case 78:
			case 79:
				System.out.printf("6");
				break;
			case 80:
			case 81:
			case 82:
			case 83:
				System.out.printf("7");
				break;
			case 84:
			case 85:
			case 86:
				System.out.printf("8");
				break;
			case 87:
			case 88:
			case 89:
			case 90:
				System.out.printf("9");
				break;
			case 45:
				System.out.printf("-");
				break;
			case 48:
				System.out.printf("0");
				break;
			case 49:
				System.out.printf("1");
				break;
			}
			
		}
			a.close();
	}

}
