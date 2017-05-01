package binarytree;

public class BinaryTree {

	private BTClass root;
	
	public BinaryTree(){
        root = null;
    }
	public boolean search(){
		if(root != null){
			return root != null;
		}
		return root == null;
	}
	public void insert(int data){
		insert(root, data);
	}
	private void insert(BTClass node, int data){
		if (data <= node.getData()){
    		if(node.left != null){
    			insert(node.left, data);
    	}else{
    		node.left = new BTClass(data);
    }
    	}else if(data > node.getData()){
    		if( node.right != null){
    			insert(node.right, data);
    		}else{
    			node.right = new BTClass(data);
    		}
    	}
    }
	
}
