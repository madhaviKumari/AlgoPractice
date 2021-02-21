
class Node{
	
	Node next;
	int data;
	
	Node(int d){
		data = d;
		next = null;
	}
	


public static Node insert(Node head,int data) {
	
	
	  if(head ==  null)
		  
	  {
		  head = new Node(data);
	  }
	  else {
		  
		  Node node = new Node(data);
		  node.next = head;
		  head = node;
		 
	  }
	  
	  return head;
	
}
public static Node insertEnd(Node head,int data) {
	 
	if(head == null) {
		head = new Node(data);
		return head;
		
	}
	
	Node currentNode = head;
	while(currentNode.next!= null) {
		currentNode = currentNode.next;
	}
	currentNode.next = new Node(data);
	return head;
	
}


public static  int totalNoOfNode( Node head) {
	int count = 0;
	while(head!= null) {
		count++;
	}
	return count;
}
public static int recuCount(Node head) {
	if(head == null) {
		return 0;
	}
	return recuCount(head.next)+1;
}


public static void printLinkd(Node head) {
	
	while(head!=null){
		System.out.print(head.data+" ");
		head = head.next;
		
	}
}


}
public class LinkedListDemo {
	
	
	

	public static void main(String[] args) {
		
		Node d = new Node(1);
		d=Node.insert(d, 2);
		d=Node.insert(d, 3);
		d=Node.insert(d, 4);
		d=Node.insert(d, 5);
		d=Node.insert(d, 6);
		d = Node.insertEnd(d, 9);
		Node.printLinkd(d);
		
		System.out.print("\ntotal no of node is"+ " " +Node.recuCount(d));
		
		
		
		// TODO Auto-generated method stub

	}

}
