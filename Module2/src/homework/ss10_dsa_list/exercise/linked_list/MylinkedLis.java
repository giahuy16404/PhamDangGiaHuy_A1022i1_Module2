package homework.ss10_dsa_list.exercise.linked_list;


import javax.xml.soap.Node;

public class MylinkedLis <E>{
    private Node head;
    private int numNodes;

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }
    public MylinkedLis(){}
    public void add(int index, Object data) {
        Node temp = head;
        Node holder;

        for(int i=0; i < index-1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }
    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }


}
