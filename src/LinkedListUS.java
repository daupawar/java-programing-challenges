import java.util.Scanner;

/**
 * Created by Rohan on 20/07/16.
 */
public class LinkedListUS {

    //Properties
    Node head;
    int count;

    //Constructors
    LinkedListUS() {
        head = null;
        count = 0;
    }

    LinkedListUS(Node newHead) {
        head = newHead;
        count = 1;
    }
    //Methods

    //add
    public void add(int newData) {
        Node temp = new Node(newData);
        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(temp);
        count++;
    }

    //get
    public int get(int index) {
        if (index <= 0) {
            return -1;
        }
        Node current = head;
        for (int i = 1; i < index; i++) {
            current = current.getNext();
        }
        return current.getData();
    }

    //size
    public int size() {
        return count;
    }

    //isEmpty
    public boolean isEmpty() {
        return head == null;
    }

    //remove
    public void remove()
    {
        //remove from the back of the list
        Node current = head;
        while (current.getNext().getNext() != null) {
            current = current.getNext();
        }
        current.setNext(null);
        count--;
    }

//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        Node head = null;
//        int N = sc.nextInt();
//
//        while (N-- > 0) {
//            int ele = sc.nextInt();
//            head = insert(head, ele);
//        }
//        display(head);
//        sc.close();
//
//    }

    static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    static Node insert(Node head, int data) {
        if (head == null)
            return new Node(data);
        else if (head.next == null) {
            head.next = new Node(data);
        } else {
            insert(head.next, data);
        }
        return head;
    }
}
