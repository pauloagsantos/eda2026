/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficha3;


/**
 *
 * @author IPT
 */
public class LinkedDupleList implements LinkedList{
    
    private Item head, tail;
    
    public LinkedDupleList() {
        head = null;
        tail = null;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public void addFirst(Object o) {
        Item item = new Item();
        item.data = o;
        item.next = null;
        item.previous = null;
        if (isEmpty()) { 
            head = item;
            tail = item;
        } else {
            item.next = head;  
            head.previous = item;
            head = item;
        }
    }

    @Override
    public void addLast(Object o) {
        Item item = new Item();
        item.data = o;
        item.next = null;
        item.previous = null;
        if (isEmpty()) { 
            head = item;
            tail = item;
        } else {
            item.previous = tail;
            tail.next = item;
            tail = item;
        }
    }

    @Override
    public boolean contains(Object o) {
        Item i = head;
        while (i != null && !i.data.equals(o))
            i = i.next;
        if (i == null)
            return false;
        else
            return true;  
    }

    @Override
    public boolean remove(Object o) {
        if (head == null)  
            return false;
        else {
            if (o.equals(head.data)) {
                if (head == tail) {
                    head = null;
                    tail = null;
                } else {
                    head = head.next;
                    head.previous = null;
                }
                return true;
            }
            Item i = head.next;
            while (i != null && !o.equals(i.data))
                i = i.next;
            if (i == tail) {
                tail = tail.previous;
                tail.next = null;
                return true;
            } else {
                if (i != null) {
                    i.previous.next = i.next;
                    i.next.previous = i.previous;
                    return true;
                }
            }
            return false;
        }
    }

    @Override
    public Object peekFirst() {
        if (isEmpty())
            return null;
        else
            return head.data;
    }

    @Override
    public Object peekLast() {
        if (isEmpty())
            return null;
        else
            return tail.data;
    }

   
    @Override
    public int count(Object o) {
        Item aux = head;
        int count = 0;
        while(aux != null) {
            if (aux.data.equals(o))
                count++;
            aux = aux.next;
        }
        return count;
    }
    
    private class Item {
        Object data;
        Item next;
        Item previous;
    }
    
}
