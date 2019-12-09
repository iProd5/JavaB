package io.turntabl.startfresh;

import java.awt.*;
import java.util.*;
import java.util.List;

public class CollectionInJava {
    public static void main(String[] args) {
        Collection<Integer> values = new ArrayList<>();
        values.add(5);
        values.add(5);
        values.add(5);
        values.add(5);
        System.out.println(values); // or we can print all by using iterator

        Iterator  it = values.iterator();
        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }



        //using List
        List<Integer> value = new ArrayList<>();//  you dont have  to specify Integer
        // in the angular bracket of ArratList
        value.add(4);
        value.add(2);
        value.add(7);
        value.add(1);
        System.out.println(value.get(3));
        Collections.sort(value);
//        Collections.reverse(value); // things we  can do in the collection class and mony others
//        Collections.shuffle(value);
        for (Integer o : value) //(Object o : value) either works
             {
            System.out.print(o + " ");
        }


    }
}
