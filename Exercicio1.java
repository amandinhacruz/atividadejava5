package atividadejava5;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
	// pedir que o usuario escreva 5 cores 
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList <String> cores = new ArrayList();
		String entradaCores;
				
		for ( int indice = 0; indice < 5; indice++) {
			System.out.println("Digite a " + (indice + 1) + "º cor: "); 
			entradaCores= leia.nextLine();
				cores.add(entradaCores);
				
			}
		System.out.println("Lista de cores:");
		for(String n : cores) {
					System.out.println( n);
				}
		System.out.println("Cores em ordem alfabetica: ");
	            cores.sort(null);
	            for (String n : cores) {
	            	System.out.println(n);
	            }
		
         
	}
}

