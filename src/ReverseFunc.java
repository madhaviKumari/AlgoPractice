
public class ReverseFunc {
	
	
	public static String reverseString(String str) {
		char[] c = str.toCharArray();
		int start =0;
		int end = c.length-1;
		while(start<end) {
			char temp = c[start];
			c[start] = c[end];
			c[end] = temp;
			start++;
			end--;
			
		}
		
		return new String(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str ="Madam".toLowerCase();
		
		System.out.println(reverseString(str));
		if(str.equals(reverseString(str))) 
			
		System.out.println("thisis is palidepp");
		else
			System.out.println("thisis is not  palidepp");
			
				
		

	}

}
