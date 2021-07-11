package ex2;

public class Main extends MyFunction {
    public static void main(String[] args) {
        int [] array = new int[10];
        for (int i = 0; i<array.length; i++) {
            array[i] = (int)(Math.random()*(600+1) - 300);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println("Максимальный элемент массива: " + array[maxElementIndex(array)]);
        System.out.println("Минимальный элемент массива: " + array[minElementIndex(array)]);

        array [maxElementIndex(array)] = array[minElementIndex(array)] * array[maxElementIndex(array)];

        printArray(array);
    }
}
