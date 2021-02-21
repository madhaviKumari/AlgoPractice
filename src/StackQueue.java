import java.util.Stack;

public class StackQueue {
	
	
	static Stack<Integer> s1 = new Stack<Integer>();
	
	static Stack<Integer> s2 = new Stack<Integer>();
	
	/*public void enqueue(int x) {
		
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
			
		}
		s1.push(x);
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
	}

	
	public int dequeue() {
		return s1.pop();
		
	}*/
	
	public void enqueueOne(int x) {
		s1.push(x);
	}
	
	public int dequeueOne() {
		if(s1.size()==1) {
			return s1.pop();
		}
		int x=s1.pop();
		int val = dequeueOne();
		s1.push(x);
		return val;
	}
	
	/*public int dequeueOne() {
		
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		int value=s2.pop();
		while(s2.isEmpty()) {
			s1.push(s1.pop());
		}
		
		return value;
		
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StackQueue q = new StackQueue();
		q.enqueueOne(5);
		q.enqueueOne(8);
		q.enqueueOne(9);
		q.enqueueOne(10);
		q.enqueueOne(20);
		q.enqueueOne(4);
		System.out.println(q.dequeueOne());
		System.out.println(q.dequeueOne());
		System.out.println(q.dequeueOne());
	}

}
