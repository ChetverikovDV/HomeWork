package lesson1;

public class ArrayCreator {
    public Integer[] createRandomValuesArray(){
        Integer[] massive = new Integer[10];
        for (int i = 0; i < massive.length; i++) {
            massive[i] = (int)(Math.random() * 10000);
        }
        return massive;
    }
}
