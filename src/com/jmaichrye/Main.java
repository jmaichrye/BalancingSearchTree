package com.jmaichrye;

import java.util.Scanner;

//Main class to write the program
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Java self balancing binary search tree - Integers only");
        BalancingSearchTree tree = new BalancingSearchTree();

        //Character to continue inserting data to the tree
        //y is continue.  n is to stop.
        String choice = "y";

        while(choice.equals("y") || choice.equals("Y") ){
            System.out.println("Please select a choice");
            System.out.println("1. Insert integer to the tree");
            System.out.println("2. Search the tree");
            System.out.println("3. Node Count ");

            int option = scan.nextInt();

            switch(option){
                case 1:
                    System.out.println("Enter element to insert: ");
                    int newInt = scan.nextInt();
                    tree.insert(newInt);
                    break;
                case 2:
                    System.out.println("Enter element to search for: ");
                    int searchInt = scan.nextInt();
                    tree.search(searchInt);
                    break;
                case 3:
                    System.out.println("Node Count: " + tree.nodeCount());
                    break;

            }

            System.out.println("Current Order of the tree: ");
            tree.printInOrder();


            System.out.println("Do you want to continue interacting with the tree?");
            System.out.println("y or Y for yes");
            choice = scan.next();
        }

    }
}
