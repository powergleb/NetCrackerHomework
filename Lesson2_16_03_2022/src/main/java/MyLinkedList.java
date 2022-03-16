
import java.util.*;
import java.util.function.UnaryOperator;

public class MyLinkedList<T> {

    private Node<T> tail;
    private Node<T> head;
    private int size;

    public MyLinkedList(){
        tail = null;
        head = null;
    }

    public int size() {
        return size;
    }

    public boolean add(T o) {
        if (tail == null){
            tail = new Node<T>(o, null, null);
            head = tail;
        }
        else{
            Node<T> prev = head;
            head = new Node<T>(o, prev, null);
            prev.setNext(head);
        }
        size++;

        return true;
    }


    public boolean remove(Object o) {
        if (size() == 1){
            tail = null;
            size--;
            return true;
        }

        Node<T> cur = tail;
        while(!cur.getValue().equals(o)){
            cur = cur.getNext();

            if (cur == null)
                return false;
        }

        if (cur == head){
            Node<T> prev = cur.getPrevious();
            head = prev;
            prev.setNext(null);
        }
        else if (cur == tail){
            tail = tail.getNext();
            tail.setPrevious(null);
        }
        else{
            Node<T> prev = cur.getPrevious();
            Node<T> next = cur.getNext();
            prev.setNext(next);
            next.setPrevious(prev);
        }
        size--;

        return true;
    }
    public T remove(int index) {
        if (index > size() || index < 0)
            return null;

        Node<T> cur = tail;
        int i = 0;
        while (i < index){
            cur = cur.getNext();
            i++;
        }
        remove(cur.getValue());
        return cur.getValue();
    }


    public T get(int index) {
        if (index < 0 || index > size())
            throw new IndexOutOfBoundsException();

        Node<T> cur = tail;
        for (int i = 0; i < index; i++){
            cur = cur.getNext();
        }

        return cur.getValue();
    }

    public Object replaceAt(int index, Object element) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException();

        Node<T> cur = tail;
        for (int i = 0; i < index; i++){
            cur = cur.getNext();
        }

        Object previousValue = cur.getValue();
        cur.setValue((T) element);
        return previousValue;
    }
}