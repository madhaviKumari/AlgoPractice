import java.util.HashMap;
import java.util.Map;

public class Solution {
	
	
	/* public Integer put(String key, Integer value) {
	  return super.put(key.toLowerCase(), value);
	 }

	
	 public Integer get(Object key) {
	  return super.get(key.toString().toLowerCase());
	 }*/
	
	public static void main(String[] args) {
		
		 String[] str= {"hello", "WORLD", "HELLO","world"};
				 
		HashMap<String,Integer> h = new HashMap<String,Integer>();
		for(int i = 0;i<str.length;i++) {
			String s = str[i].toLowerCase();
			if(h.containsKey(s)) {
				int old_count = h.get(s);
				h.put(s, old_count+1);
							
			}
			else {
				h.put(s, 1);
			}
			//System.out.println(s+" "+h.containsKey(s));
		}
		
		
		
		for(String key:h.keySet()) {
			System.out.println(key+ "-" +h.get(key));
	}
		

	}

}
