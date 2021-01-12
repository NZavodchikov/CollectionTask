package com.nzavod.mycollections.partOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class MyLinkedList<E> implements ILinkedList<E> {
    private Node<E> first;
    private int size = 0;

    public MyLinkedList() {
    }

    public MyLinkedList(Node<E> first) {
        this.first = first;
        size++;
    }

    public Node<E> getFirst() {
        return first;
    }

    public void setFirst(Node<E> first) {
        this.first = first;
    }

    public int getSize() {
        return size;
    }
    public Node<E> getByIndex(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        Node<E> tmpNode = first;
        for(int i = 1; i <= index; i++){
            tmpNode = tmpNode.getNextNode();
        }
        return tmpNode;
    }

    @Override public void add(E element) {
        if(size !=0){
            getByIndex(size-1).setNextNode(new Node(element));
        }
        else {
            first = new Node<>(element);
        }
        size++;
    }

    @Override public void add(int index, E element) {
        Node<E> tmpNodePrevious = getByIndex(index-1);
        Node<E> tmpNodeSecondary = getByIndex(index);
        tmpNodePrevious.setNextNode(new Node(element, tmpNodeSecondary));
        size++;
    }

    @Override public void clear() {
        Node<E> removableNode = first;
        while(removableNode != null){
            Node<E> tmpNode = removableNode.getNextNode();
            removableNode.setNextNode(null);
            removableNode.setElement(null);
            removableNode = tmpNode;
        }
        size=0;

    }

    @Override public E get(int index) {
        return getByIndex(index).getElement();
    }

    @Override public int indexOf(E element) {
        for(int i = 0; i < size; i++){
            if (getByIndex(i).getElement().equals(element)){
                return i;
            }
        }
        return -1;
    }

    @Override public E remove(int index) {
        E element;
        element = getByIndex(index).getElement();
        getByIndex(index-1)
                .setNextNode(
                        getByIndex(index+1
                        )
                );
        size--;
        return element;
    }

    @Override public E set(int index, E element) {
        getByIndex(index).setElement(element);
        return getByIndex(index).getElement();
    }

    @Override public int size() {
        return size;
    }

    @Override public E[] toArray() {
        ArrayList<E> list = new ArrayList<>();
        for (int i = 0; i < size; i++){
            list.add(getByIndex(i).getElement());
        }
        return (E[])list.toArray();
    }

    @Override public Iterator<E> iterator() {
        return new MyIterator<>();
    }

    @Override public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MyLinkedList<?> that = (MyLinkedList<?>) o;
        return size == that.size &&
               Objects.equals(first, that.first);
    }

    @Override public String toString() {
        return Arrays.toString(toArray());
    }

    @Override public int hashCode() {
        return Objects.hash(first, size);
    }

    private class MyIterator<E> implements Iterator<E>{

        private Node<E> node;

        @Override
        public E next() {
            E element = (E) node.getElement();
            node = node.getNextNode();
            return element;
        }

        @Override
        public boolean hasNext() {
            return node != null;
        }
    }
}
