package array;
import java.util.Arrays;
public class ArrayDay1 {

	public static void main(String[] args) {
//		int nubers [] = {10,29,40,50};
//		System.out.println(Arrays.toString(nubers));
		
		// we can use the foreach loop for the Array
		// Foreach loop is only used for the array
		
		int number [] = new int[5];
		number[0]=60;
		number[1]=70;
		number[2]=45;
		number[3]=80;
//		if there is any value missing then it will take the default value
		
//		number[5]=100; the extra values cannot return it will give an error "Index Out Of Bound" 
		
		for(int num : number) {
			System.out.println(num);
		}
	}
	
}
