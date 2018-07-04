package testingjava;

import java.util.Arrays;

public class ArrayInsertNo2 {
    /**
     * This Method insert element into an Array
     *
     * @param input    This is the array which is given to the method
     * @param data     This is data which is given to the method
     * @param position This is position in which data to be inserted
     * @return This method will return inserted array
     */
    private int[] insert(int[] input, int data, int position) {
        int[] output = new int[input.length + 1];
        for (int i = 0; i < output.length; i++) {
            if (i < position - 1) {
                output[i] = input[i];
            } else if (i == position - 1) {
                output[position - 1] = data;
            } else if (i > position - 1) {
                output[i] = input[i - 1];
            }
        }
        return output;
    }

    public static void main(String[] args) {
        ArrayInsertNo2 obj = new ArrayInsertNo2();
        int array[] = {10, 20, 30, 40, 50};
        int[] output = obj.insert(array, 100, 1);
        System.out.println(Arrays.toString(output));
        output = obj.insert(array, 200, 6);
        System.out.println(Arrays.toString(output));

    }
}
