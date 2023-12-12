package atividadejava5;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Iterator;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Set <Integer> numeros = new HashSet<Integer>();
		 int entradaNum;
		
		for(int indice = 0; indice < 10; indice++) {
			 System.out.println("Digite o " +(indice + 1) + " º número:" );
			 entradaNum = leia.nextInt(); 
			 numeros.add(entradaNum);
		 } 
		  Iterator<Integer> inumeros = numeros.iterator();
		while (inumeros.hasNext()) {
			 System.out.println(inumeros.next());
			 
			 
		 }

	}

}
