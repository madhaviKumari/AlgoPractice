import java.util.ArrayList;
import java.util.HashMap;

public class DeadLockDemo {
	
	public static ArrayList<Integer> arraySubtraction(int arr1[],int arr2[]) {
		
		
		ArrayList<Integer> output = new ArrayList<Integer>();
		
		HashMap<Integer,Integer> ht = new HashMap<Integer,Integer>();
		
		for(int i= 0;i<arr2.length;i++) {
			
			int count =0;
			if(ht.containsKey(arr2[i])) {
				
				count = ht.get(arr2[i]);
				
			}
			ht.put(arr2[i], count+1);
			
		}
		System.out.println(ht);
		
		for(int i =0;i<arr1.length;i++) {
			
			int counter = 0;
			if(ht.containsKey(arr1[i])) {
				counter = ht.get(arr1[i]);
			}
			
			if(counter==0) {
				output.add(arr1[i]);
			}
			else {
				ht.put(arr1[i], counter-1);
			}
		}
		
		return output;
	}
	
	
	public static void main(String [] args) {
		
		
		int arr1[]= {3,5,2,7,4,2,7};
		int arr2[] = {1,7,5,2,2,9};
		System.out.print(arraySubtraction(arr1,arr2));
		
	}
	

}
