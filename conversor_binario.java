package aulas;

public class conversor {

	public static void main(String[] args) {
		int decimal = 10;
		String binaria = Integer.toBinaryString(decimal); //Decimal para Binário
		System.out.println(binaria +" Decimal para bin");
		
		System.out.println("-----------------------------");
		
		int decima = 65015120;
		String hexadecimal = Integer.toHexString(decima); // Decimal para Hexadecimal
		System.out.println(hexadecimal +" Decimal para Hexa");
		
		System.out.println("-----------------------------");
		
		String hex="4c5f";  
		int decimaal=Integer.parseInt(hex,16);  //Hexadecimal para Decimal
		System.out.println(decimaal + " Hexadecimal para Decimal");  
		
		System.out.println("-----------------------------");
		
		String bin_para_hexa = Integer.toString(Integer.parseInt("00110000010", 2), 16);
		System.out.println(bin_para_hexa + " Bin para hexa"); //Binario para Hexadecimal
		
		System.out.println("-----------------------------");
		
		String hexa_para_bin = Integer.toString(Integer.parseInt("8a9d", 16), 2);
		System.out.println(hexa_para_bin + " Hexa para bin"); //Hexadecimal para Binario 
		
		System.out.println("-----------------------------");
		
		String bin = "011001";
		int numero = Integer.parseInt(bin, 2); // binario para decimal
		System.out.println(numero +" bin para Decimal");
		
	}

}
