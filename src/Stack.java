import com.Bridgelabz.LinkedList;

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
    public static void main(String[] args){
        stack.push();
    }
}
