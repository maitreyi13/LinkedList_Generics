package com.Bridgelabz;

import java.util.Scanner;

public class LinkedList {
    Node head;
    Node tail;
    static LinkedList ll = new LinkedList();
   static Scanner scanner = new Scanner(System.in);
    public void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node temp = head;
            this.head = newNode;
            newNode.next = temp;
        }
    }
    public void print() {
        if (head == null) {
            System.out.println("Linked List is Empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data+ " ");
                temp = temp.next;
            }
        }
    }
    public void defaultNode(){
        if (head == null) {
            System.out.print("Default Head : ");
            ll.push(70);
            print();
        }else {
            addNode();
        }
    }
    public void addNode() {
        System.out.print("\nDo you want to add a node? (1/0) : ");
        int yn = scanner.nextInt();
        if(yn == 1) {
            System.out.print("How many nodes you want to add: ");
            int no = scanner.nextInt();
            for (int i =1; i<=no; i++) {
                System.out.print("\n1-> Add data at start \n0-> Stop : ");
                switch (scanner.nextInt()) {
                    case 1 -> {
                        System.out.print("\nEnter a new node: ");
                        int num = scanner.nextInt();
                        ll.push(num);
                        print();
                    }
                    case 0 -> {
                        print();
                        System.out.println("Thank you!");
                    }
                }
            }
        } else {
            print();
        }
    }

        public static void main (String[]args) {
            System.out.println("***** Linked List Data Structure Program ***** \n");
            ll.defaultNode();
            ll.addNode();
        }
}
