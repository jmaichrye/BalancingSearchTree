package com.jmaichrye;

import static java.lang.StrictMath.max;

/**
 * Created by Jon Maichrye on 4/7/2017.
 *
 * Class to create an individual tree and it's operations
 */

public class BalancingSearchTree {

    //root node of the tree
    private Node rootNode;

    //Declaration, null root value
    public BalancingSearchTree(){
        rootNode = null;
    }

    //clear the entire tree by setting root node to be null
    public void clear(){
        rootNode=null;
    }

    //public access to insert an integer to the tree
    public void insert(int x){
        rootNode = insert(x , rootNode);
    }

    //insertion with nodes as a parameter to enable recursive insertion
    private Node insert(int newInt, Node Top) {
        if(Top==null){
            Top = new Node(newInt);
        }
        //new integer is less than the root value
        else if(newInt > Top.value){
            //insert the value in the left node
            Top.leftNode = insert(newInt , Top.leftNode);

        }
        //new integer is greater than the root value
        else if(newInt < Top.value){
            //insert the value in the right node
            Top.rightNode = insert(newInt , Top.rightNode);


        }
        //root is equal to the new value, do nothing
        else{

        }

        Top.height = max(height(Top.leftNode), height(Top.rightNode)) + 1;
        return Top;

    }

    //To avoid null pointer exceptions on returning left and right node's heights
    private int height(Node node) {
        if(node==null){
            return 0;
        }
        else{
            return node.height;
        }
    }

    //seach for an existing value
    public void search(int searchInt) {
    }

    //return root node count
    public int nodeCount() {
        return nodeCount(rootNode);
    }

    //recursively calculate the node count until you real null nodes
    private int nodeCount(Node rootNode) {
        if(rootNode!=null){
            //count 1 for the current node and the two sub nodes
            return 1 + nodeCount(rootNode.leftNode) + nodeCount(rootNode.rightNode);
        }
        else{
            // return 0 if current node is null
            return 0;
        }
    }

    //check if the tree is empty
    public boolean isEmpty() {
        if(rootNode==null){
            return true;
        }
        else {
            return false;
        }
    }

    //public access to print the tree in order
    public void printInOrder() {
        printInOrder(rootNode);
    }

    //recursive printing method
    private void printInOrder(Node rootNode) {
        if(rootNode!=null){
            printInOrder(rootNode.leftNode);
            System.out.println(rootNode.value);
            printInOrder(rootNode.rightNode);
        }
    }
}
