
public class SumProduct {
	
	public static int resultOfSum(int arr[]) {
		int sum = 0;
		for(int i =0;i<arr.length-2;i++) {
			for(int j = i+1;j<=arr.length-1;i++) {
				sum = sum + arr[i]*arr[j];
			}
		}
		
		return sum;
	}

	public static void main(String[] args) {
		

		
		int arr[] = {1,3,4};
		System.out.print(resultOfSum(arr));
	}

}
