package COURSE_01_DSA_BY_ScottBarrett.Section_04_LinkedLists;

public class O20_LL__Constructor {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList(4);
        System.out.println(linkedList.getClass());

    }
}

class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }
}

class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
        next = null;
    }
}
