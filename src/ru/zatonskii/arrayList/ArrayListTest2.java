package ru.zatonskii.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListTest2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(8);

        Iterator<Integer> iterator = arrayList.iterator();

        while (iterator.hasNext()) {
            Integer integer = iterator.next();
            System.out.println(integer);
        }
        System.out.println("А теперь то же самое, но через оптимизированный итератор под списки");
        ListIterator<Integer> listIterator = arrayList.listIterator();

        while (listIterator.hasNext()) {
            Integer integer = listIterator.next();
            System.out.println(integer);
        }
        System.out.println("Едем дальше");
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            arrayList1.add(i);
        } for (Integer temp : arrayList1) {
            System.out.print(temp);
        }
    }
}
