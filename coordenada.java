package curso_progamacao;

import java.util.Scanner;

public class coordenada {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int x=0;
		int alcool=0;
		int gasolina=0;
		int diesel=0;
		
		System.out.println("1. Àlcool");
		System.out.println("2. Gasolina");
		System.out.println("3. Diesel");
		System.out.println("4. Fim");
		System.out.println("Informe o tipo de combustível:");
		while(x!=4) {x=sc.nextInt();
			if(x==1) {
				alcool+=1;
				System.out.println("1. Àlcool: "+alcool);
			}
			else if(x==2) {
				gasolina+=1;
				System.out.println("1. Gasolina: "+gasolina);
			}
			else if(x==3) {
				diesel+=1;
				System.out.println("3. Diesel: "+diesel);
			}
		}
		System.out.println("Muito obrigado");
		System.out.println("1. Àlcool: "+alcool);
		System.out.println("2. Gasolina: "+gasolina);
		System.out.println("3. Diesel: "+diesel);
	
		sc.close();
	}
}
