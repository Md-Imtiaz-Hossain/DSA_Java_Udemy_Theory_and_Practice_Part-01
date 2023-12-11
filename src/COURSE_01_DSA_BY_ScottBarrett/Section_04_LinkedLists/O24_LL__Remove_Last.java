package COURSE_01_DSA_BY_ScottBarrett.Section_04_LinkedLists;

public class O24_LL__Remove_Last {
    public static void main(String[] args) {
        LinkedList_24 linkedList_24 = new LinkedList_24(4);

        System.out.print("List: ");
        linkedList_24.printList();
        linkedList_24.getHead();
        linkedList_24.getTail();
        linkedList_24.getLength();
        System.out.println();

        linkedList_24.append(6);
        System.out.println("List: ");
        linkedList_24.printList();
        linkedList_24.getHead();
        linkedList_24.getTail();
        linkedList_24.getLength();
    }
}

class LinkedList_24 {
    private Node_24 head;
    private Node_24 tail;
    private int length;

    public LinkedList_24(int value) {
        Node_24 newNode = new Node_24(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void append(int value) {
        Node_24 newNode = new Node_24(value);
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
        Node_24 temp = head;
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

class Node_24 {
    int value;
    Node_24 next;

    Node_24(int value) {
        this.value = value;
        next = null;
    }
}
