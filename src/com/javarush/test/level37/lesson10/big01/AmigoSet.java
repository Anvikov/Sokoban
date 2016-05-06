package com.javarush.test.level37.lesson10.big01;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

/**
 * Created by User on 006 2016.05.06.
 */
public class AmigoSet<E> implements Cloneable, Serializable, Set {
    private static final Object PRESENT = new Object();
    private transient HashMap<E, Object> map;

    public AmigoSet() {
        this.map = new HashMap<>();
    }

    public AmigoSet(Collection<? extends E> collection) {
        int capacity = (int) Math.max(16, collection.size() / .75f);
        this.map = new HashMap<>(capacity);
        for (E e : collection) {
            this.add(e);
        }
    }

    @Override
    public int size() {
        return map.keySet().size();
    }

    @Override
    public boolean isEmpty() {
        return map.keySet().isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return map.keySet().contains(o);
    }

    @Override
    public Iterator iterator() {
        return map.keySet().iterator();
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object e) {
        try {
            map.put((E) e, PRESENT);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    @Override
    public boolean remove(Object o) {
        return map.keySet().remove(o);
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {
        map.keySet().clear();
    }


    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        AmigoSet<E> amigoSet = new AmigoSet<>();
        try {
            amigoSet.addAll(this);
            amigoSet.map.putAll(this.map);
        } catch (Exception e) {
            throw new InternalError();
        }
        return amigoSet;
    }

    private void writeObject(ObjectOutputStream s) throws IOException
    {
        s.defaultWriteObject();
        s.writeInt((int)HashMapReflectionHelper.callHiddenMethod(map, "capacity"));
        s.writeFloat((float)HashMapReflectionHelper.callHiddenMethod(map, "loadFactor"));
        s.writeInt(map.size());
        for (E element : map.keySet())
        {
            s.writeObject(element);
        }
    }

    private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException
    {
        s.defaultReadObject();
        int capacity = s.readInt();
        float loadFactor = s.readFloat();
        int size = s.readInt();
        map = new HashMap<>(capacity, loadFactor);

        for (int i = 0; i < size; i++)
        {
            map.put((E)s.readObject(), PRESENT);
        }
    }
}
