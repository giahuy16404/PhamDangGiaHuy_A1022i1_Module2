package homework.ss10_dsa_list.exercise.linked_list;

import java.lang.reflect.Field;
import java.util.NoSuchElementException;

public class MyLinkedList<E> {
    private class Node<E> {
        private Node<E> next;
        private E element;

        Node(E element) {
            this.element = element;
            this.next = null;
        }
    }

    private Node<E> head;
    private Node<E> last;
    private int size;

    public MyLinkedList() {
        this.head = null;
    }

    public void addFirst(E element) {
        Node<E> newNode = new Node<>(element);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addLast(E element) {
        Node<E> newNode = new Node<>(element);
        if (head == null) {
            head = newNode;
        } else {
            Node<E> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public void add(int index, E element) {
        Node<E> newNode = new Node<>(element);
        Node<E> current = head;
        if (index == 0) {
            addFirst(element);
        } else {
            if (current == null) {
                throw new NoSuchElementException();
            }
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            size++;
        }
    }

    public E remove(int index) {
        if (index >= size || index < 0) {
            throw new NoSuchElementException();
        }
        Node<E> current = head;
        if (index == 0) {
            head = head.next;
        } else {
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
        return current.element;
    }

    public boolean remove(Object e) {
        Node<E> current = head;
        if (e == null) {
            return false;
        }
        if (head.element.equals(e)) {
            head = head.next;
            size--;
            return true;
        }
        while (current.next != null) {
            if (current.next.element.equals(e)) {
                current.next = current.next.next;
                size--;
                break;
            }
            current = current.next;
        }
        return false;
    }

    public int size() {
        return size;
    }

    public boolean add(E e) {
        Node<E> newNode = new Node<>(e);
        Node<E> current = head;
        if (head == null) {
            throw new NoSuchElementException();
        } else {
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;

        }
        size++;
        return true;
    }

//    public E clone(){
//
//    }

    public E get(int i) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<E> current = head;
        for (int j = 0; j < i; j++) {
            current = current.next;
        }
        return current.element;
    }

    public E getFirst() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        return head.element;
    }

    public E getLast() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        Node<E> current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current.element;
    }
}











