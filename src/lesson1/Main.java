package lesson1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите кол-во элементов массива: ");
        Integer value = scanner.nextInt();
        ArrayRandom random = new ArrayRandom();

        ArrayListTest arrayListTest1 = new ArrayListTest();
        arrayListTest1.addArray(random.generate(value));

    }
}
