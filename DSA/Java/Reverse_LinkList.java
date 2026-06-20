package DSA.Java;

public class Reverse_LinkList {
    //
//    Node head;
//
//    class Node {
//        String data;
//        Node next;
//
//        Node(String data) {
//            this.data = data;
//            this.next = null;
//        }
//    }
//    public void reverseList(){
//        if( head == null || head.next == null){
//            return ;
//        }
//
//        Node prevNode = head;
//        Node currNode = head.next;
//        while(currNode !=null){
//            Node nextNode = currNode.next;
//            currNode.next = prevNode;
//            prevNode = currNode;
//            currNode  = nextNode;
//        }
//        head.next = null;
//        head = prevNode;
//    }
//
//    public Node reverseListrecursive(Node head){
//        if(head == null || head.next == null ){
//            return head;
//        }
//
//        Node newHead = reverseListrecursive(head.next);
//
//        head.next.next = head;
//        head.next = null;
//        return newHead;
//    }
//
//    public static void main(String[] args) {
//        LinkedList<Integer> list = new LinkedList<Integer>();
//
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.reverseList();
//    }

    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void reverseList(){
        if( head == null || head.next == null){
            return ;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode  = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public Node reverseListrecursive(Node head){
        if(head == null || head.next == null ){
            return head;
        }
        Node newHead = reverseListrecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public void printList() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Reverse_LinkList list = new Reverse_LinkList();

        list.head = list.new Node("1");
        list.head.next = list.new Node("2");
        list.head.next.next = list.new Node("3");
        list.head.next.next.next = list.new Node("4");

        System.out.println("Original List:");
        list.printList();

        System.out.println("\nReversing iteratively...");
        list.reverseList();
        list.printList();


        System.out.println("\nReversing back recursively...");
        list.head = list.reverseListrecursive(list.head);
        list.printList();
    }
}
