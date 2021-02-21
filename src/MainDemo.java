
class LinkedList{
	Node head;
	
	LinkedList(){
		
	}
	
	public void insertEnd(int data) {
		if(head == null) {
			head=new Node(data);
			return;
		}
		Node temp = head;
		//System.out.println("Inserting "+data);
		while(temp.next!=null) {
			temp =temp.next;
			
		}
		temp.next = new Node(data);
	}
	
	public void printLinkedList() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
			
		}
	}
	
	
	public void ReverseLinkedList() {
		Node pre = head.next;
		Node current;
		current = pre;
		//head.next = null;
		while(current!=null) {
			current = current.next;
			pre.next = head;
			head= pre;
			pre=current;
			
		}
		
	}
	
}


public class MainDemo {
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insertEnd(1);
		list.insertEnd(2);
		list.insertEnd(3);
		list.insertEnd(4);
		list.insertEnd(5);
		list.insertEnd(6);
		list.ReverseLinkedList();
		list.printLinkedList();
	}

}
