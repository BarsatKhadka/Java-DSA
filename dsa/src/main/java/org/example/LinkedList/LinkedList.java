package org.example.LinkedList;

public class LinkedList {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list.insertFirst(5);
        list.insertFirst(10);
        list.insertLast(15);
        list.insertLast(20);
        list.customInsert(1,2);
        list.display();
    }
}
