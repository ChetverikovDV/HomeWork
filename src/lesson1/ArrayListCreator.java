package lesson1;

import java.util.*;

public class ArrayListCreator {
    public List addArray(){
        ArrayCreator creator = new ArrayCreator();
        Integer[] mass = creator.createRandomValuesArray();
        System.out.println(Arrays.toString(mass));                      //проверка

                  long start = System.currentTimeMillis();              //  СТАРТ
                                                                        //    V
        List <Integer> list = new ArrayList<>();                        //    V
        for (int i = 0; i < mass.length; i++){                          //    V
            list.add(mass[i]);                                          //    V
        }                                                               //    V
                  long finish = System.currentTimeMillis();             //  ФИНИШ
                  long difference = finish - start;

        System.out.print("Прошло времени: " +difference);             //  Прошло времени
        System.out.println(" миллисекунд");
        //  System.out.println(list);                                 //    проверка

        return list;
    }
}
