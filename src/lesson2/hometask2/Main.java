package lesson2.hometask2;

import lesson2.hometask2.carTesting.*;

public class Main {
    public static void main(String[] args) {
        Testable listTestable = new CarListTest();
        Testable mapTestable = new CarMapTest();
        result(listTestable,"----------------------List----------------------");
        result(mapTestable,"-----------------------Map-----------------------");
    }
    public static void result(Testable testable, String kindOfCollections) {
        System.out.println(kindOfCollections);
        testable.test();
        System.out.println("--------------------------------------------------");
    }
}