package lesson1;

import java.util.*;

public class ArrayListCreator {
    public List<Integer> addArray(Integer array[]){

                  long start = System.currentTimeMillis();              //  СТАРТ
                                                                        //    V
        List <Integer> list = new ArrayList<>();                        //    V
        for (int i = 0; i < array.length; i++){                         //    V
             list.add(array[i]);                                        //    V
        }                                                               //    V
                  long finish = System.currentTimeMillis();             //  ФИНИШ
                  long difference = finish - start;

        System.out.print("Прошло времени: " +difference);             //  Прошло времени
        System.out.println(" мс");
        // System.out.println(list);                                 //    проверка

        return list;
    }
}
