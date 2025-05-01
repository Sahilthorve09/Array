package array;
import java.util.Arrays;

public class OperaionOnArray {

	public static void main(String[] args) {
		int num [] = {10,50,20,30,40};
		int num1[] = {10,50,20,30,40};
		System.out.println("Printing Array                  :  "+Arrays.toString(num));
		
		// fetch data (accessing the particular data from the array)
		
		int fdata = num[3];
		System.out.println("Printing fetched data from array:  "+fdata);
		
		// update data (changing the particular data from the array)
		
		num[3] = 70; 
		System.out.println("Updated Array                   :  "+Arrays.toString(num));
		
		int numCopy [] = Arrays.copyOf(num, 9);
		System.out.println("Copy of num with extra length   :  "+Arrays.toString(numCopy));
		
		int numCopyRange[]= Arrays.copyOfRange(num, 0, 3);
		System.out.println("Copy of num array to particular range (0-3): "+Arrays.toString(numCopyRange));
		System.out.println();
		
		//searching operation by binary method
		
		System.out.println("Searching the loction of particular data by using binary method: "+Arrays.binarySearch(num, 70));
		System.out.println();
		
		// Finding length of the array
		
		System.out.println("Length of num array is: "+num.length);
		System.out.println();
		
		// sorting array 
		
		Arrays.sort(num);
		System.out.println("Sorted num array: "+Arrays.toString(num));
		System.out.println();
		
		// Checking two array is it equal or not
		
		int a [] = {10,20,30,4,50};
		int b [] = {10,20,30,4,50};
		int c [] = {10,20,30,40,50};
		System.out.println("a == b : "+Arrays.equals(a, b));
		System.out.println("a == c : "+Arrays.equals(a, c));
		
		int prime []= {3,5,7,11};
		int max = 0;
		for (int i = 0; i< prime.length;i++) {
			if (max <prime[i]) {
				max  = prime[i];
				
			}
			
		}
		System.out.println(max);
		
	}
	
}
