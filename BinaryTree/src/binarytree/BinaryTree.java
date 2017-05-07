package binarytree;

import java.util.ArrayList;

public class BinaryTree {

	private BTClass root;
	ArrayList<Integer> tree = new ArrayList<Integer>();
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
    		if(node.right != null){
    			insert(node.right, data);
    		}else{
    			node.right = new BTClass(data);
    		}
    	}
    }
	public void delete(int data){
		delete(root, data);
	}
	private void delete(BTClass node, int data){
		if (root == null){
			new RuntimeException("Nothing in here fam");
		}else{
			node.left = node.right;
		}
	}
	public void inorder(){
		inorder(root);
	}
	private void inorder(BTClass r){
		if (r != null){
			inorder(r.getLeft());
			System.out.print(r.getData() + " ");
			tree.add(r.getData());
			inorder(r.getRight());
		}
	}
}
