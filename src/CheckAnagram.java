import java.util.HashSet;

public class CheckAnagram {
	
	

	public static boolean isAnagram(String str,String str2) {
		char s[]= str.toCharArray();
		char s2[]= str2.toCharArray();
		
		HashSet<Character> set = new HashSet<Character>();
	      for(int i=0;i<s.length;i++) {
	    	  set.add(s[i]);
	    	  	
	    	  
	      }
	      
	      for(int j = 0;j<s2.length;j++)
	      {
	    	  if(!set.contains(s2[j]))
	    		  return false;
	      }
	   
	      return true;
	     
		
		
		
		
		/*for(int i = 0;i<s.length;i++)
		{	
			
			boolean flag = false;
			for(int j= 0; j<s2.length; j++) {
				if(s[i]==s2[j])
				{
				flag = true;
				break;
				}
				
			}
			
			if(flag==false) {
				return false;
			}
			
		}
		
		return true;*/
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[] w ={"abc","bca","cab","cba","def"};
		
		String input = "abc";
				
		//String[] words = {"abc","bca", "cab", "cba", "def"​};
		for(int i=0;i<w.length;i++)
		{
			if(isAnagram(w[i],input))
				System.out.println(w[i]);
		}
	//System.out.print(isAnagram(w[],input));
		
		

	}

}
