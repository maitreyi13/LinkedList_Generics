package com.Bridgelabz;
import java.util.Scanner;
public class Stack {
    LinkedList linkedList = new LinkedList();
    static Stack stack = new Stack();
    static Scanner scanner = new Scanner(System.in);
    public void push(){
        System.out.print("Enter an item in stack : ");
        int num = scanner.nextInt();
        linkedList.addNode(num);
        linkedList.print();
    }
    public void display() {
        System.out.print("\nDo you want to create a stack (1/0) : ");
        int yn = scanner.nextInt();
        if (yn == 1) {
            System.out.print("How many items you want to add or delete: ");
            int no = scanner.nextInt();
            for (int i = 1; i <= no; i++) {
                System.out.println("\n1-> Add an item \n2-> Pop the stack  \n0-> Stop : ");
                int add = scanner.nextInt();
                switch (add) {
                    case 1 -> push();
                    case 2 -> {
                        linkedList.print();
                        for (int j=1; j< i; j++){
                            linkedList.pop();
                            linkedList.print();
                        }
                    }
                    case 0 -> {
                        linkedList.print();
                        System.out.println("Thank you!");
                    }
                }
            }
        } else {
            linkedList.print();
            System.out.println("\nThank you!");
        }
    }
    public static void main(String[] args){
        stack.display();
    }
}
