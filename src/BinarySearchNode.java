import java.util.*;

/**
 * Created by Rohan on 29/07/16.
 */
public class BinarySearchNode {

    private static int getHeight(Node root) {
        //Write your code here
        if (root == null) {
            return -1;
        }
        return 1 + (Math.max(getHeight(root.left), getHeight(root.right)));
    }

    static void levelOrder(Node root){
        //Write your code here

        Queue<Node> queue=new LinkedList<>();
        if(root!=null){
            queue.add(root);
            while (!queue.isEmpty()){
                Node node=queue.remove();
                System.out.print(node.data+" ");
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
        }
    }

    static Node removeDuplicates(Node head) {
        //Write your code here
        if (head == null)
            return head;
        else if (head.next == null)
            return head;
        else {
            Node tmp = head;
            while (tmp.next != null){
                if (tmp.data == tmp.next.data){
                    tmp.next = tmp.next.next;
                } else{
                    tmp = tmp.next;
                }
            }
            return head;
        }
    }

    private static int size(Node n) {
        Stack<Node> sizeStack = new Stack();
        int count = 1;//includes the n node
        if (n == null) {
            return 0;
        }
        sizeStack.push(n);
        while (!sizeStack.isEmpty()) {
            Node node = sizeStack.pop();
            while (node != null) {
                count++;
                if (node.right != null) {
                    sizeStack.push(node.right);
                }
                node = node.left;
            }
        }
        return count;
    }


//    private static Node insert(Node root, int data) {
//        if (root == null) {
//            return new Node(data);
//        } else {
//            Node cur;
//            if (data <= root.data) {
//                cur = insert(root.left, data);
//                root.left = cur;
//            } else {
//                cur = insert(root.right, data);
//                root.right = cur;
//            }
//            return root;
//        }
//    }

    static  Node insert(Node head,int data)
    {
        Node p=new Node(data);
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        //levelOrder(root);
        removeDuplicates(root);
        //int height = getHeight(root);
        //System.out.println(height);
    }
}
