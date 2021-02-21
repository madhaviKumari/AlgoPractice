
public class secondSmallest {
	

	
	public static int secondMin(int arr[]) {
		int min = arr[0];
		int smin = arr[0];
		for(int i =1;i<arr.length;i++)
		{
		       if(min>arr[i]) {
		    	   smin =min;
		    	   min =arr[i];
		       }
		}
		
		return smin;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {10,4,5,6,7,9,1,0};
		System.out.print(secondMin(a));
	}

}
