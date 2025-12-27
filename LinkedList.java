class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }
}

public class LinkedList {
    Node head = null;

    public void add(int data) {
        Node newNode = new Node(data);

        Node current = head;

        if (head == null)
            head = newNode;
        else {
            // this will move pointer till the last node
            while (current.next != null)
                current = current.next;

            current.next = newNode; // this will add update ref of newnode to existing lastnode
        }

    }
    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void delete(int data){
        Node current = head;
        while(current.next != null && current.next.data != data)
            current=current.next;
        current.next = current.next.next;
    }

    public void printValues() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        LinkedList nums = new LinkedList();
        nums.add(5);
        nums.add(9);
        nums.add(11);
        nums.addFirst(3);

        nums.delete(9);

        nums.printValues();
    }

}