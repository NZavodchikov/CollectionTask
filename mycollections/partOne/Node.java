package com.nzavod.mycollections.partOne;

public class Node<E> {
    private E element;
    private Node nextNode;

    public Node() {
        nextNode = null;
        element = null;
    }
    public Node(E element){
        this.element = element;
        nextNode = null;
    }

    public Node(E element, Node nextNode) {
        this.element  = element;
        this.nextNode = nextNode;
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}
