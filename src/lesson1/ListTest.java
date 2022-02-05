package lesson1;

import java.util.*;

public class ListTest {
    public List<Integer> addArrayToArrayList(Integer array[]){

                  long start = System.currentTimeMillis();              //  СТАРТ
                                                                        //    V
        List <Integer> list = new ArrayList<>();                        //    V
        for (int i = 0; i < array.length; i++){                         //    V
             list.add(array[i]);                                        //    V
        }                                                               //    V
                  long finish = System.currentTimeMillis();             //  ФИНИШ
                  long difference = finish - start;

        System.out.print("ArrayList.     " +difference);    //  Прошло времени
        System.out.print(" мс     ");
        // System.out.println(list);                                   //    проверка

        return list;
    }

    public LinkedList<Integer> addArrayToLinkedList(Integer array[]){

             long start = System.currentTimeMillis();                   //  СТАРТ
                                                                        //    V
        LinkedList<Integer> list = new LinkedList<>();                  //    V
        for (int i = 0; i < array.length; i++){                         //    V
            list.add(array[i]);                                         //    V
        }                                                               //    V
              long finish = System.currentTimeMillis();                 //  ФИНИШ
              long difference = finish - start;

        System.out.print("LinkedList.     " +difference);   //  Прошло времени
        System.out.println(" мс");
        // System.out.println(list);                                   //    проверка

        return list;

    }
}
