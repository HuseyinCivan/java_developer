package com.cybertek.lambda.sorting;

import com.cybertek.core.collections.ArrayLists;

import java.util.*;

public class NumberList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(15);
        list.add(3);
        list.add(500);
        list.add(25);

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, new MyComparator());
        System.out.println(list);

        //bunun yerine ustte yeni method yaptik,
        // Comparator interfsace i implement ettik,
        // normalde o1>o2 ise return 1 idi biz onu -1 yaptik
        // yani Comparator u ters cevirdik
        // ama hazir comparator.reverseOrder() da kullanabiliriz

//        Collections.sort(list,Comparator.reverseOrder());

        //ya da boyle de olabilir
//        Collections.reverse(list);
//        System.out.println(list);


        // with Lambda

        //Ascending order
        Collections.sort(list);
        System.out.println(list);

        //Descending Order
        Collections.sort(list, (o1, o2) -> (o1 > o2) ? -1 : (o2 > o1) ? 1 : 0);
        System.out.println(list);

        //Ascending order
        list.sort((o1, o2) -> o1.compareTo(o2));
        System.out.println(list);

        //Descending order
        list.sort((o2, o1) -> o1.compareTo(o2));
        System.out.println(list);

    }
}
