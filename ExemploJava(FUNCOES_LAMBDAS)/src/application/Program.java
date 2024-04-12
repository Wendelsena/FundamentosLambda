package application;

import java.util.ArrayList;
import java.util.function.Consumer;;

public class Program {

	public static void main(String[] args) {
		
		ArrayList<Integer> valores = new ArrayList<Integer>();
		ArrayList<Integer> dobro = new ArrayList<Integer>();
		ArrayList<Integer> impar = new ArrayList<Integer>();
		ArrayList<Integer> par = new ArrayList<Integer>();
		
		valores.add(1);
		valores.add(2);
		valores.add(3);
		valores.add(4);
		valores.add(5);
		valores.add(6);
		
		// forEach é usado para percorrer os elementos da lista sem a necessidade de um loop explicito.
		// valores.forEach(v -> dobro.add(v * 2)); OU TBM:
		// Consumer<Integer> dobrar = v -> dobro.add(v * 2); // Consumer é um tipo de função lambda.
		// valores.forEach(dobrar);
		
		valores.forEach(p -> { dobro.add(p * 2);
			if(p % 2 == 0) {
				par.add(p);
			} else {
				impar.add(p);
			}
		});
		
		
		
		System.out.println(valores);
		System.out.println(dobro);
		System.out.println(impar);
		System.out.println(par);
		
		

	}

}
