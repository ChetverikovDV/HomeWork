/**
 * Генератор рандомного массива
 * принимает на вход value количество элементов
 */

package lesson1;

public class ArrayRandom implements ArrayGenerator{

    @Override
    public Integer[] generate(int value){
        Integer array[] = new Integer[value];
             for (int i = 0; i < array.length; i++) {
             array[i] = (int)(Math.random() * 10000);
    }
        return array;
    }
}
