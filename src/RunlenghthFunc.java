import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class RunlenghthFunc {
	
	
	public static String runLength(String s)
	{
     char[] c = s.toCharArray();
		
		Map<Character,Integer> h = new LinkedHashMap<Character,Integer>();
		
		for(int i = 0;i<c.length;i++) {
			
			if(h.containsKey(c[i])) {
				int count = h.get(c[i]);
				h.put(c[i], count+1);
			
			}
			
			else {
				h.put(c[i], 1);
			}
			
		}
			StringBuilder builder = new StringBuilder();
			for(char cr:h.keySet()) {
				if(h.get(cr)==1) {
					builder.append(cr);
				}
				else {
					builder.append(cr+""+h.get(cr));
				}
				
			}
		
			return builder.toString();
		
		
	}

	public static void main(String[] args) {
		
		String s = "yyyybbbbdexxxxxxx";
		System.out.print(runLength(s));
		
		// TODO Auto-generated method stub

		
	
	
	}

}
