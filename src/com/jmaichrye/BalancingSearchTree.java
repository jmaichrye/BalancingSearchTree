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
        else if(newInt < Top.value){
            //insert the value in the left node
            Top.leftNode = insert(newInt , Top.leftNode);

            //if height difference is more than 2, balancing is needed
            if( height(Top.leftNode)-height(Top.rightNode)>1){

                //left left condition - need to rotate tree to the right
                if (newInt < Top.leftNode.value){
                    Top = rotateRight( Top );
                }
                //else left right condition
                else {
                    //rotate left node left first
                    Top.leftNode = rotateLeft(Top.leftNode);
                    //rotate the overall tree to the right
                    Top = rotateRight(Top);
                }

            }

        }
        //new integer is greater than the root value
        else if(newInt > Top.value){
            //insert the value in the right node
            Top.rightNode = insert(newInt , Top.rightNode);

            //if height difference is more than 2, balancing is needed
            if( height(Top.rightNode)-height(Top.leftNode)>1){

                //Right Right condition
                if (newInt > Top.rightNode.value) {
                    Top = rotateLeft(Top);
                }
                //else right left condition
                else {
                    //rotate right node to the right first
                    Top.rightNode = rotateRight(Top.rightNode);

                    //rotate the overall tree to the left
                    Top = rotateLeft(Top);
                }
            }


        }
        else{
            //root is equal to the new value, do nothing
        }

        //New height of the tree is the max of each side's height plus 1
        Top.height = max(height(Top.leftNode), height(Top.rightNode)) + 1;

        //return the changed tree
        return Top;

    }


    /* Rotate binary tree node with left child */
    private Node rotateRight(Node topNode)
    {
        //left node moves to the top of new node
        Node newNode = topNode.leftNode;

        //Have to replace topNode.leftNode as it moved to teh top new newNode tree
        //Top.left.right replaces original Top,left value
        topNode.leftNode = newNode.rightNode;

        // Original top node moves to the right side of the new node
        newNode.rightNode = topNode;

        //new top node max - max height of each children plus 1
        topNode.height = max( height( topNode.leftNode ), height( topNode.rightNode ) ) + 1;

        //new node's height -  max height of the left side and the height of the right node which is the
        //original top node
        newNode.height = max( height( newNode.leftNode ), height( newNode.rightNode ) ) + 1;
        return newNode;
    }

    /* Rotate binary tree node with right child */
    private Node rotateLeft(Node topNode)
    {
        //right node moves to the top of the new node
        Node newNode = topNode.rightNode;

        // Replace the topNode.right node as this has moved to the top of the newNode tree
        //Top.right.left moves to the right node of the top node
        topNode.rightNode = newNode.leftNode;

        //Original top node moves to the left side of the tree completing the left rotation
        newNode.leftNode = topNode;

        //calculate the top node's new height
        topNode.height = max( height( topNode.leftNode ), height( topNode.rightNode ) ) + 1;

        //new node's height -  max height of the right side and the height of the left node which is the
        //original top node
        newNode.height = max( height( newNode.rightNode ), height( newNode.rightNode) ) + 1;
        return newNode;
    }


    //To avoid null pointer exceptions on returning left and right node's heights
    private int height(Node node) {
        if(node==null){
            return -1;
        }
        else{
            return node.height;
        }
    }

    //seach for an existing value
    public void search(int searchInt) {

        System.out.println("The value " + searchInt + " exists: " + search(searchInt, rootNode));
    }

    private boolean search(int searchInt, Node Top) {
        if(Top==null){
            return false;
        }
        else if(Top.value==searchInt){
            return true;
        }
        else{
            return search(searchInt,Top.leftNode) || search(searchInt,Top.rightNode);
        }

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


    //public access to print the tree in order
    public void printInOrder() {
        printInOrder(rootNode, "   ");
    }

    //recursive printing method
    private void printInOrder(Node rootNode, String height) {
        if(rootNode!=null){
            printInOrder(rootNode.leftNode,height +"   ");
            System.out.println(height + rootNode.value);
            printInOrder(rootNode.rightNode, height + "   ");
        }
    }
}
