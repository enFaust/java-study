package org.course.fundamential.sort;

import java.io.File;
import java.io.IOException;

class Main{

    public static void main(String[] args) throws IOException {

        File dataFile = new Generator().generate("data.txt", 100);
        System.out.println(new Validator(dataFile).isSorted()); // false
        File sortedFile = new Sorter().sortFile(dataFile);
        System.out.println(new Validator(sortedFile).isSorted()); // true
    }
}