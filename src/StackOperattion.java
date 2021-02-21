import java.util.Stack;

public class StackOperattion {
	
	
	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<>();
		stack.push(10);
		stack.push(9);
		stack.push(11);
		stack.push(3);
		System.out.println(geMin(stack));
		
		
	}
	
	static int geMin(Stack<Integer> stack) {
		Stack<Integer> st = new Stack<Integer>();
		int min = Integer.MAX_VALUE;
		while(!stack.isEmpty()) {
			int x = stack.pop();
			if(min>x) {
				min=x;
			}
			
			st.push(x);
		}
		
		
		while(!st.isEmpty()) {
			stack.push(st.pop());
		}
		return min;
	}

}
