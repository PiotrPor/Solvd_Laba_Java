package com.solvd.library;

import java.util.LinkedList;
import java.util.Collection;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyLinkedListWithGeneric<T> {
    public LinkedList<T> c;
    private static final Logger LOGGER = LogManager.getLogger(MyLinkedListWithGeneric.class);

    public MyLinkedListWithGeneric() {
        c = new LinkedList<>();
    }

    public MyLinkedListWithGeneric(Collection givenCollection) {
        c = new LinkedList<>(givenCollection);
    }

    public void add(T something) {
        c.add(something);
    }

    public T get(int index) {
        T toBeReturned = null;
        try {
            toBeReturned = c.get(index);
        } catch(IndexOutOfBoundsException e) {
            LOGGER.warn("Exception when accessing LinkedList: "+ e.getMessage());
        }
        return toBeReturned;
    }

    public boolean isEmpty() {
        return c.isEmpty();
    }

    public int size() {
        return c.size();
    }
}
