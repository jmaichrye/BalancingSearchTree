package com.jmaichrye;

/**
 * Created by Jon Maichrye on 4/7/2017.
 *
 * Class to define a node of a tree and it's operations.
 */
public class Node {

    public Node leftNode;
    public Node rightNode;
    int value, height;

    public Node(){
        value=0;
        height = 0;
        leftNode=null;
        rightNode=null;
    }

    public Node(int value){
        this.value=value;
        height = 0;
        leftNode=null;
        rightNode=null;
    }

}
