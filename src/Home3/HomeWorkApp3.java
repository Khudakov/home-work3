package Home3;

import java.lang.reflect.Array;

public class HomeWorkApp3 {

    public static void main(String[] args) {

        int[] array = {0, 1, 1, 0, 0, 1, 1, 0, 0, 1};
        printArray(" Before:\t", array);
        printArray(" After:\t", array);

        int[] array2 = new int[100];
        numbers(array2);
        printArray("2. Filled with cycle:\t", array2);

        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        printArray("3. Before:\t", array3);
        multiplication(array3);
        printArray("3. After:\t", array3);

        printArrayInConsole(returnArray(5, 100500));

    }


    public static void printArray(String msg, int[] inputArray) {
        System.out.print(msg);
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 1; j < inputArray.length; j++) {
            }
            System.out.print(inputArray[i] + "\t");
        }
        System.out.println();
    }
    // Почему [j] обозначается как ошибка?


    public static void numbers(int[] array) {
        for (int i = 0; i < array.length; i++)
            array[i] = i + 1;
    }



    public static void multiplication(int[] array) {
        for (int i = 0; i < array.length; i++)
            if (array[i] < 6)
                array[i] *= 2;
    }



    public static int[] returnArray(int len, int initialValue) {
        int array[] = new int[len];

        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }



    public static void printArrayInConsole(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.println(inputArray[i] + " ");
        }
        System.out.println();
    }
}


