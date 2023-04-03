package org.course.collections.introduction.arraylist.custom;

/**
 * Реализуйте свою версию ArrayList
 * Используя массив, напишите свою версию ArrayList
 * https://docs.oracle.com/javase/8/docs/api/java/util/List.html
 * <p>
 * Реализуйте следующие методы:
 * - get()
 * - add()
 * - remove()
 * - size()
 * - contains()
 * - isEmpty()
 * */
public class CustomArrayList<T> implements CustomList<T>{
    @Override
    public T get() {
        return null;
    }

    @Override
    public void add(T element) {

    }

    @Override
    public void remove(T element) {

    }

    @Override
    public void remove(int index) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean contains(T element) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
