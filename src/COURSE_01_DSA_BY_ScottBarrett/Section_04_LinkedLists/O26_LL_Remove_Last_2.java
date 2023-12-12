package COURSE_01_DSA_BY_ScottBarrett.Section_04_LinkedLists;

public class O26_LL_Remove_Last_2 {
    public static void main(String[] args) {

        ArrayList_26 arrayList_26 = new ArrayList_26(4);

        System.out.println("List: ");
        arrayList_26.printList();
        arrayList_26.printHead();
        arrayList_26.printTail();
        arrayList_26.printLength();

        arrayList_26.append(6);
        System.out.println("\nList: ");
        arrayList_26.printList();
        arrayList_26.printHead();
        arrayList_26.printTail();
        arrayList_26.printLength();


        arrayList_26.removeLast();
        System.out.println("\nList: ");
        arrayList_26.printList();
        arrayList_26.printHead();
        arrayList_26.printTail();
        arrayList_26.printLength();
    }
}

class ArrayList_26 {
    private Node_26 head;
    private Node_26 tail;
    private int length;

    public ArrayList_26(int value) {
        Node_26 node_26 = new Node_26(value);
        head = node_26;
        tail = node_26;
        length = 1;
    }

    public Node_26 removeLast() {
        if (length == 0) return null; // While list is empty

        Node_26 temp = head;
        Node_26 pre = head;

        // While list is not empty
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;

        if (length == 0) {
            head = null;
            tail = null;
        }

        return temp;
    }

    public void append(int value) {
        Node_26 node_26 = new Node_26(value);
        if (length == 0) {
            // While list is empty
            head = node_26;
            tail = node_26;
        } else {
            // While list is not empty
            tail.next = node_26;
            tail = node_26;
        }
        length++;
    }

    public void printList() {
        Node_26 temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printHead() {
        System.out.println("Head: " + head.value);
    }

    public void printTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void printLength() {
        System.out.println("Length: " + length);
    }


}


class Node_26 {
    int value;
    Node_26 next;

    public Node_26(int value) {
        this.value = value;
        next = null;
    }
}