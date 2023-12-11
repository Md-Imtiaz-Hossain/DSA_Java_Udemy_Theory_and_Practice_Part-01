package COURSE_01_DSA_BY_ScottBarrett.Section_04_LinkedLists;

public class O23_LL__Append {
    public static void main(String[] args) {

        LinkedList_23 linkedList_23 = new LinkedList_23(4);

        System.out.print("List: ");
        linkedList_23.printList();
        linkedList_23.getHead();
        linkedList_23.getTail();
        linkedList_23.getLength();
        System.out.println();

        linkedList_23.append(6);
        System.out.println("List: ");
        linkedList_23.printList();
        linkedList_23.getHead();
        linkedList_23.getTail();
        linkedList_23.getLength();
    }
}

class LinkedList_23 {
    private Node_23 head;
    private Node_23 tail;
    private int length;

    public LinkedList_23(int value) {
        Node_23 newNode = new Node_23(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void append(int value) {
        Node_23 newNode = new Node_23(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public void printList() {
        Node_23 temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }


    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

}

class Node_23 {
    int value;
    Node_23 next;

    Node_23(int value) {
        this.value = value;
        next = null;
    }
}
