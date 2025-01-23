package org.example.LinkedList;

public class CustomLinkedList {
        private Node head;
        private Node tail;
        private int size;

        public CustomLinkedList() {
            this.size = 0;

        }

        public void insertFirst(int data) {
            Node newNode = new Node(data);
            //before making this head , make its next Node head
            newNode.next = head;

            //then THEN make it head.
            head = newNode;

            if(tail == null) {
                tail = newNode;
            }
            size++;
        }

        public void display() {
            Node current = head;
            while(current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
        }

        public void insertLast(int data) {
            if(tail == null) {
                insertFirst(data);
                return;
            }
            Node newNode = new Node(data);
            newNode.next = null;
            tail.next = newNode;
            tail = newNode;
            size++;

        }

        public void customInsert(int data , int position) {
            Node temp = head;
            for(int i = 1; i < position; i++) {
                temp = temp.next;
            }

            Node newNode = new Node(data,temp.next);
            temp.next = newNode;
            size++;



        }





    private class Node{
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
