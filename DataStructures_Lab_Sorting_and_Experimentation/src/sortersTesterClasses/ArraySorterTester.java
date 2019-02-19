package sortersTesterClasses;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

import sorterClasses.BubbleSortSorter;
import sorterClasses.InsertionSortSorter;
import sorterClasses.SelectionSortSorter;
import interfaces.Sorter;


public class ArraySorterTester {
	private static ArrayList<Sorter<Integer>> sortersList = new ArrayList<>(); 
	private static Integer[] array = {5, 9, 20, 22, 20, 5, 4,
									 13, 17, 8, 22, 1, 3, 7, 11, 9, 10};
	
	
	public static void main(String[] args) { 
		sortersList.add(new BubbleSortSorter<Integer>()); 
		sortersList.add(new SelectionSortSorter<Integer>()); 
		sortersList.add(new InsertionSortSorter<Integer>()); 
		
		test("Sorting Using IntegerComparator1 (Increasing Order)", new IntegerComparator1()); 
		test("Sorting Using IntegerComparator2 (Decreasing Order)", new IntegerComparator2()); 
	}
	
	private static void test(String msg, Comparator<Integer> cmp) { 


		System.out.println("\n\n*******************************************************");
		System.out.println("*** " + msg + "  ***");
		System.out.println("*******************************************************");
		
	
		Integer[] array2 = array.clone();
			showArray("\n ---Original array of size " + array.length + " to sort:", array); 
			
			for (int s=0; s<sortersList.size(); s++) {
				Sorter<Integer> sorter = sortersList.get(s); 
			
			    sorter.sort(array, cmp);
			    showArray(sorter.getName() + ": ", array); 
			}
	
		array = array2;
			
	}

	private static void showArray(String msg, Integer[] a) {
		System.out.print(msg); 
		for (int i=0; i<a.length; i++) 
			System.out.print("\t" + a[i]); 
		System.out.println();
	}
	
}
