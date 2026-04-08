package kbtu.oop.lab3.problem3.model;
import java.util.Iterator;

public class MyArrayList<E> implements MyCollection<E> {
	private Object[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    
    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }
    
    @Override
    public int size() {
        return size;
    }
    
    @Override
    public boolean isEmpty() {
        return size == 0;
    }
    
    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(o)) {
            	return true;
            }
        }
        return false;
    }
    
    @Override
    public boolean add(E e) {
        if (size == elements.length) {
            Object[] newArr = new Object[elements.length * 2];
            
            System.arraycopy(elements, 0, newArr, 0, size);
            elements = newArr;
        }
        elements[size++] = e;
        return true;
    }
    
    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(o)) {
                elements[i] = elements[size - 1];
                elements[size - 1] = null;
                size--;
                return true;
            }
        }
        return false;
    }
    
    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }
    
    @Override
    public boolean containsAll(MyCollection<?> c) {
        Iterator<?> it = c.iterator();
        
        while (it.hasNext()) {
            if (!contains(it.next())) {
            	return false;
            }
        }
        return true;
    }
    
    @Override
    public boolean addAll(MyCollection<? extends E> c) {
        Iterator<? extends E> it = c.iterator();
        boolean changed = false;
        while (it.hasNext()) {
            if (add(it.next())) {
            	changed = true;
            }
        }
        return changed;
    }
    
    @Override
    public boolean removeAll(MyCollection<?> c) {
        Iterator<?> it = c.iterator();
        boolean changed = false;
        while (it.hasNext()) {
            if (remove(it.next())) {
            	changed = true;
            }
        }
        return changed;
    }
    
    @Override
    public boolean retainAll(MyCollection<?> c) {
        MyArrayList<E> toRemove = new MyArrayList<>();
        for (int i = 0; i < size; i++) {
            @SuppressWarnings("unchecked")
            E e = (E) elements[i];
            if (!c.contains(e)) {
                toRemove.add(e);
            }
        }
        return removeAll(toRemove);
    }
    
    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private int index = 0;
            
            @Override
            public boolean hasNext() {
                return index < size;
            }
            
            @Override
            public E next() {
                @SuppressWarnings("unchecked")
                E result = (E) elements[index++];
                return result;
            }
        };
    }
    
    @Override
    public Object[] toArray() {
        Object[] result = new Object[size];
        System.arraycopy(elements, 0, result, 0, size);
        return result;
    }

}
