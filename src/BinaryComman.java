import java.util.ArrayList;
import java.util.List;

class BinaryNode{
	 public int data;
	 public BinaryNode left,right;
	 
	 BinaryNode(int d){
		 data = d;
		 left = right = null;
	 }
 }
 
 
 
 
public class BinaryComman {
	
	
	
	 BinaryNode root;
	 
	 
	 BinaryComman(int key)
	    {
	        root = new BinaryNode(key);
	    }
	 
	 BinaryComman()
	    {
	        root = null;
	    }
	 
	 
	 
	 public void inorder(BinaryNode node) {
		 if(node==null) {
			 return;
		 }
		 
		 inorder(node.left);
		 System.out.print(node.data+" ");
		 inorder(node.right);
	 }

	 private List<Integer> allans=new ArrayList<>();
	 public boolean commonAncestor(BinaryNode node,int key) {
		 
		 
		 if(node==null) {
			 return false;
		 }
		 if(node.data==key) {
			 return true;
			 
		 }
		 boolean b2=false; 
		boolean b1 =  commonAncestor(node.left,key);
		if(b1) {
			//System.out.print(node.data+" ");
			allans.add(node.data);
		}
		
		else {
			b2 = commonAncestor(node.right,key);
			if(b2) {
				//System.out.print(node.data+" ");
				allans.add(node.data);
			}
		}
		return b1 | b2;  
		 
	 }
	 
	 
	 
	 public void commonAncestorTwo(BinaryNode node,int key1,int key2) {
		 allans=new ArrayList<>();
		 commonAncestor(node,key1);
		 List<Integer> keyOneAns = new ArrayList<>();
		 keyOneAns.addAll(allans);
		 
		 allans=new ArrayList<>();
		 commonAncestor(node,key2);
		 
		 
		 for(Integer i: keyOneAns) {
			 if(allans.contains(i)) {
				 System.out.print(i+" ");
			 }
		 }
	 }
	 
	 private void printLowestAns(int data) {
		 allans=new ArrayList<>();
		 commonAncestor(root, data);
		 System.out.println(allans.get(0));
	 }
	 
	 private void printGreatest(int data) {
		 allans=new ArrayList<>();
		 commonAncestor(root, data);
		 System.out.println(allans.get(allans.size()-1));
		 //System.out.println("\n"+allans);
	 }
	 

	public static void main(String[] args) {
		
		 
		 BinaryComman tree = new  BinaryComman();
		 tree.root = new BinaryNode(1);
		 tree.root.left = new BinaryNode(2);
		 tree.root.right = new BinaryNode(3);
		 tree.root.left.left = new BinaryNode(4);
		 tree.root.left.right = new BinaryNode(5);
		 tree.root.left.right.left = new BinaryNode(8);
		 tree.root.left.right.left.right = new BinaryNode(9);
		 
		 tree.root.right.left = new BinaryNode(6);
		 tree.root.right.right = new BinaryNode(7);
		 tree.root.right.left.left = new BinaryNode(10);
		 tree.root.right.right.left = new BinaryNode(15);
		 tree.root.right.right.left.right = new BinaryNode(25);
		 tree.root.right.right.left.right.left = new BinaryNode(26);
		 
		 
		 tree.inorder(tree.root);
		 System.out.println();
		 //tree.commonAncestor(tree.root, 25);
		 //tree.printLowestAns(25);
		 //tree.printGreatest(25);
		 tree.commonAncestorTwo(tree.root, 6, 50);
		 
	
		 
		 
		 
		 
		 
	     
		 
		 
		// TODO Auto-generated method stub

	}

}
