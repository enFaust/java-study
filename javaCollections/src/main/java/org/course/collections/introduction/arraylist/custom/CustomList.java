package org.course.collections.introduction.arraylist.custom;

/**
 * * - get()
 * * - add()
 * * - remove()
 * * - size()
 * * - contains()
 * * - isEmpty()
 */
public interface CustomList<T> {

    T get();

    void add(T element);

    void remove(T element);

    void remove(int index);

    int size();

    boolean contains(T element);

    boolean isEmpty();
}
