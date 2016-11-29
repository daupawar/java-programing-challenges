import javax.swing.text.html.parser.AttributeList;

/**
 * Created by Rohan on 20/07/16.
 */
public class Node {

    Node left,right,next;

    int data;
    Node(int data){
        this.data=data;
        left=right=next=null;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }


    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }


}
