package lesson1;

import java.util.*;

public class ArrayListCreator {
    public List addArray(){
        ArrayCreator creator = new ArrayCreator();
        Integer[] mass = creator.createRandomValuesArray();
        System.out.println(Arrays.toString(mass));                      //проверка

        List <Integer> list = new ArrayList<>();
        for (int i = 0; i < mass.length; i++){
            list.add(mass[i]);
        }
        System.out.println(list);                                         //проверка

        return list;
    }
}
