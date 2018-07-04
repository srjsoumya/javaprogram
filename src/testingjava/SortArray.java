package testingjava;

public class SortArray {
    /**
     * This method will Bubble sort the array in ascending order
     *
     * @param array this is the array given to the method as an argument
     * @return This will return sorted array
     */
    private int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++)
            for (int j = 0; j < array.length - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
        return array;
    }

    /**
     * This method will Selection sort the array in ascending order
     *
     * @param array this is the array given to the method as an argument
     * @return This will return sorted array
     */
    private int[] selectionSort(int array[]) {
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < array.length - 1; i++) {
            // Find the minimum element in unsorted array
            int min_index = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[min_index])
                    min_index = j;

            // Swap the found minimum element with the first
            // element
            int temp = array[min_index];
            array[min_index] = array[i];
            array[i] = temp;
        }
        return array;
    }

    /**
     * This method will Insertion sort the array in ascending order
     *
     * @param array this is the array given to the method as an argument
     * @return This will return sorted array
     */
    private int[] insertionSort(int array[]) {
        for (int i = 1; i < array.length; ++i) {
            int key = array[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
        return array;
    }

    /**
     * This method Display all element of the Array
     *
     * @param input This method takes an Array as an argument
     */
    private void display(int[] input) {
        for (int i : input) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SortArray obj = new SortArray();
        int[] array1 = {10, 100, 20, 10, 30, 100, 220};
        int[] output = obj.bubbleSort(array1);
        obj.display(output);
        int[] array2 = {10, 100, 30, 20, 10, 40, 80, 50};
        output = obj.selectionSort(array2);
        obj.display(output);
        int[] array3 = {10, 100, 30, 20, 10, 40, 80, 50};
        output = obj.insertionSort(array3);
        obj.display(output);


    }
}

