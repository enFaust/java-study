package org.course.collections.introduction.a_arraylist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

import static org.course.collections.introduction.a_arraylist.StringArrayList.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringArrayListTest {

    private List<String> names;

    @BeforeEach
    void initTest() {
        names = new ArrayList<>(Arrays.asList(
                "Андрей", "Александр", "Иван", "Николай", "Сергей",
                "Анастасия", "Мария", "Екатерина", "Ольга", "Юлия"
        ));
    }

    @Test
    public void testSortListInDescendingOrder() {

        List<String> result = sortingValues(names);

        assertTrue(isSort(result));
    }

    @Test
    void testInsertValue() {
        List<String> result = insertValue(names, "Егор", 3);
        assertEquals("Егор", result.get(3));
    }

    @Test
    public void testRemoveNamesEndingWithYa() {

        List<String> expectedNames = new ArrayList<>(Arrays.asList(
                "Андрей", "Александр", "Иван", "Николай", "Сергей",
                "Мария", "Екатерина", "Ольга"
        ));

        List<String> result = deleteValueByEndSymbolYa(names);

        assertEquals(expectedNames, result);
    }

    private boolean isSort(List<String> list) {
        ListIterator<String> it = list.listIterator(list.size());
        String current;
        String previous = it.previous();
        while (it.hasPrevious()) {
            current = it.previous();
            if (previous.compareTo(current) < 0) {
                return false;
            }
            previous = current;
        }
        return true;
    }

}