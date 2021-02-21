import java.util.ArrayList;

public class CheckBinaryBST {
	
public static BinaryNode root;
	 
	 
 CheckBinaryBST(int key)
	    {
	        root = new BinaryNode(key);
	    }
	 
 CheckBinaryBST()
	    {
	        root = null;
	    }
	
	public static ArrayList<Integer> a = new ArrayList<>();
	 public void inorder(BinaryNode node) {
		
		 if(node==null) {
			 return;
		 }
		 
		 inorder(node.left);
		 a.add(node.data);
		 inorder(node.right);
		 
		
	 }
	 
	 
	 public static boolean checkArray() {
		 
		 for(int i =1;i<a.size();i++) {
			 if(a.get(i)<a.get(i-1))
			 {
				 return false;
			 }
			 
		 }
		 return true;
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CheckBinaryBST tree = new CheckBinaryBST();
		
		 tree.root = new BinaryNode(50);
		 tree.root.left = new BinaryNode(35);
		 tree.root.right = new BinaryNode(87);
		 tree.root.left.left = new BinaryNode(20);
		 tree.root.left.right = new BinaryNode(39);
		 tree.root.left.right.left = new BinaryNode(60);
		 tree.root.left.right.left.right = new BinaryNode(90);
		 
		 
		tree.inorder(root);
		 System.out.print(a);
		System.out.println("\n"+tree.checkArray());
		

  

		

	}

}
