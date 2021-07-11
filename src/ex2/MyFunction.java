package ex2;

public class MyFunction {

    public static int maxElementIndex (int[] array) {
        int max = -999999999;
        int maxIndex = -1;
        for (int i = 0; i<array.length; i++){
            if (max<array[i]) {
                max = array[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static int minElementIndex (int[] array) {
        int min = 999999999;
        int minIndex = -1;
        for (int i = 0; i<array.length; i++){
            if (min>array[i]) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void printArray (int [] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }



}
