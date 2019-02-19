package sortersTesterClasses;

import interfaces.Sorter;
import sorterClasses.BubbleSortSorter;


// Implement this Class
public class EnteroTester {
	public static void main(String[] args) {
		Sorter<Entero> EnteroList = new BubbleSortSorter<Entero>();
		Entero[] entero = new Entero[5];
		entero[0] = new Entero(78);
		entero[1] = new Entero (3);
		entero[2] = new Entero(23);
		entero[3] = new Entero(1);
		entero[4] = new Entero(50);
		
		showArray("Before sorting\n" , entero);
		EnteroList.sort(entero, null);
		showArray("After sorting\n" , entero);
	}
	
	private static void showArray(String msg, Entero[] a) {
		System.out.print(msg); 
		for (int i=0; i<a.length; i++) 
			System.out.print("\t" + a[i]); 
		System.out.println();
	}
}