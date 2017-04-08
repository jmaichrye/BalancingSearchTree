package com.jmaichrye;

/**
 * Created by Jon Maichrye on 4/7/2017.
 *
 * Class to create an individual tree and it's operations
 */

public class BalancingSearchTree {

    private Node rootNode;

    public BalancingSearchTree(){
        rootNode = null;
    }

    public void clear(){
        rootNode=null;
    }


    public void insert(int newInt) {
    }

    public void search(int searchInt) {
    }

    public int nodeCount() {
        return nodeCount(rootNode);
    }

    private int nodeCount(Node rootNode) {
        if(rootNode!=null){
            return 1 + nodeCount(rootNode.leftNode) + nodeCount(rootNode.rightNode);
        }
        else{
            return 0;
        }
    }

    public boolean isEmpty() {
        if(rootNode==null){
            return true;
        }
        else{
            return false;
        }
    }

    public void printInOrder() {
        printInOrder(rootNode);
    }

    private void printInOrder(Node rootNode) {
        if(rootNode!=null){
            printInOrder(rootNode.leftNode);
            System.out.println(rootNode.value);
            printInOrder(rootNode.rightNode);
        }
    }
}
