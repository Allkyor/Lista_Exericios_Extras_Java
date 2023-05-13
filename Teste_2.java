package aulas;
import java.util.Scanner;
public class Teste_2 {
	public static void main(String[] args) {
		String i1, i2 = "";
		Scanner a = new Scanner(System.in);
		System.out.println("Informe os n�meros: ");
		i1 = a.nextLine();
		for (int i = 0; i < i1.length(); i++) {
			int cont = 0;
			char t = i1.charAt(i);
			if ((i + 1) < i1.length() && i1.charAt(i) == i1.charAt(i + 1)) {
				cont++;
				if ((i + 2) < i1.length()&& i1.charAt(i + 1) == i1.charAt(i + 2)) {
					cont++;
					if ((i + 3) < i1.length()&& i1.charAt(i + 1) == i1.charAt(i + 3)) {
						cont++;
					}
				}
			}
			switch (t) {
			case '2':
				switch (cont) {
				case 0:
					i2 += "a";
					break;
				case 1:
					i2 += "b";
					break;
				case 2:
					i2 += "c";
					break;
				}
				break;
			case '3':
				switch (cont) {
				case 0:
					i2 += "d";
					break;
				case 1:
					i2 += "e";
					break;
				case 2:
					i2 += "f";
					break;
				}
				break;
			case '4':
				switch (cont) {
				case 0:
					i2 += "g";
					break;
				case 1:
					i2 += "h";
					break;
				case 2:
					i2 += "i";
					break;
				}
				break;
			case '5':
				switch (cont) {
				case 0:
					i2 += "j";
					break;
				case 1:
					i2 += "k";
					break;
				case 2:
					i2 += "l";
					break;
				}
				break;
			case '6':
				switch (cont) {
				case 0:
					i2 += "m";
					break;
				case 1:
					i2 += "n";
					break;
				case 2:
					i2 += "o";
					break;
				}
				break;
			case '7':
				switch (cont) {
				case 0:
					i2 += "p";
					break;
				case 1:
					i2 += "q";
					break;
				case 2:
					i2 += "r";
					break;
				case 3:
					i2 += "s";
					break;
				}
				break;
			case '8':
				switch (cont) {
				case 0:
					i2 += "t";
					break;
				case 1:
					i2 += "u";
					break;
				case 2:
					i2 += "v";
					break;
				}
				break;
			case '9':
				switch (cont) {
				case 0:
					i2 += "w";
					break;
				case 1:
					i2 += "x";
					break;
				case 2:
					i2 += "y";
					break;
				case 3:
					i2 += "z";
					break;
				}
				break;
			case '0':
				i2 += " ";
				break;
			}
			i += cont;
			cont = 0;			
		}
		System.out.println(i2);
		a.close();
	}
	

}
