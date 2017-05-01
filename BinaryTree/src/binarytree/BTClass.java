package binarytree;

public class BTClass {

	BTClass left, right;
    int data;
    
    public BTClass(){
        left = null;
        right = null;
        data = 0;
    }
    public BTClass(int n){
        left = null;
        right = null;
        data = n;
    }
    public void setLeft(BTClass n){
        left = n;
    }

    public void setRight(BTClass n){
        right = n;
    }

    public BTClass getLeft(){
        return left;
    }

    public BTClass getRight(){
        return right;
    }

    public void setData(int d){
        data = d;
    }

    public int getData(){
        return data;
    }   
}
