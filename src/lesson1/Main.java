package lesson1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите кол-во элементов массива: ");
        Integer value = scanner.nextInt();
        ArrayRandom random = new ArrayRandom();

        Integer tempArray[] = random.generate(value);
        //System.out.println(Arrays.toString(tampArray));

        ListTest arrayListTest = new ListTest();
        arrayListTest.addArrayToArrayList(tempArray);
        ListTest linkedListTest = new ListTest();
        linkedListTest.addArrayToLinkedList(tempArray);

    }
}
