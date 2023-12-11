package COURSE_01_DSA_BY_ScottBarrett.Section_04_LinkedLists;

public class O22_LL__Print_List {
    public static void main(String[] args) {

        LinkedList_22 linkedList_22 = new LinkedList_22(4);
        new LinkedList_22(6);
        new LinkedList_22(8);

        System.out.println("List: ");
        linkedList_22.printList();
        linkedList_22.getHead();
        linkedList_22.getTail();
        linkedList_22.getLength();

    }
}

class LinkedList_22 {
    private final Node_22 head;
    private final Node_22 tail;
    private final int length;

    public LinkedList_22(int value) {
        Node_22 newNode = new Node_22(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node_22 temp = head;
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

class Node_22 {
    int value;
    Node_22 next;

    Node_22(int value) {
        this.value = value;
        next = null;
    }
}
