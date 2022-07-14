package com.Bridgelabz;

import java.util.Scanner;

public class LinkedList {
    Node head;
    Node tail;
    static LinkedList ll = new LinkedList();
    static Scanner scanner = new Scanner(System.in);
    public Node addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node temp = head;
            this.head = newNode;
            newNode.next = temp;
        }
        return newNode;
    }
    public void print() {
        if (head == null) {
            System.out.println("Linked List is Empty");
        } else {
            System.out.print("Linked List -> ");
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data+ " ");
                temp = temp.next;
            }
        }
    }
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            this.tail.next = newNode;
            tail = newNode;
        }
    }
    public void defaultNode(){
        if (head == null) {
            System.out.print("Default Head : ");
            int def = scanner.nextInt();
            ll.addNode(def);
            print();
        }else {
            display();
        }
    }
    public void insertInBetween(Node head,Node newNode){
            Node tempNode = head.next;
            head.next = newNode;
            newNode.next = tempNode;
    }
    public void pop() {
        this.head = this.head.next;
    }
    public void display() {
        System.out.print("\nDo you want to add a node? (1/0) : ");
        int yn = scanner.nextInt();
        if(yn == 1) {
            System.out.print("How many nodes you want to add or delete: ");
            int no = scanner.nextInt();
            for (int i =1; i<=no; i++) {
                System.out.print("\n1-> Add data at start \n2-> Append data \n3-> Insert In-Between \n4-> Delete data\n0-> Stop : ");
                int add = scanner.nextInt();
                System.out.print("\nEnter a node: ");
                int num = scanner.nextInt();
                switch (add) {
                    case 1 -> {
                        ll.addNode(num);
                        print();
                    }
                    case 2 -> {
                        ll.append(num);
                        print();
                    }
                    case 3 -> {
                        Node newNode = new Node(num);
                        ll.insertInBetween(head,newNode);
                        print();
                    }
                    case 4 -> {
                        pop();
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
        ll.display();
    }
}
