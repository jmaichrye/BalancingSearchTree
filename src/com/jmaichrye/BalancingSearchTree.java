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

                //left left case
                if(newInt < Top.leftNode.value){
                    //rotate right
                    Top = rotateRightNode(Top);
                }
                else{
                    // left rotate for left side of root
                    Top.leftNode = rotateLeftNode(Top.leftNode);
                    // right rotate for the root node
                    Top = rotateRightNode(Top);
                }


            }

        }
        //new integer is greater than the root value
        else if(newInt > Top.value){
            //insert the value in the right node
            Top.rightNode = insert(newInt , Top.rightNode);

            //if height difference is more than 2, balancing is needed
            if( height(Top.rightNode)-height(Top.leftNode)>1){

                //left left case
                if(newInt > Top.rightNode.value){
                    //rotate left
                    Top = rotateLeftNode(Top);
                }
                else{
                    // left rotate for right side of root
                    Top.rightNode = rotateRightNode(Top.rightNode);
                    // left rotate for the root node
                    Top = rotateLeftNode(Top);
                }


            }


        }
        else{
            //root is equal to the new value, do nothing
        }

        Top.height = max(height(Top.leftNode), height(Top.rightNode)) + 1;
        return Top;

    }

    private Node rotateLeftNode(Node Top) {


    }

    private Node rotateRightNode(Node top) {

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
