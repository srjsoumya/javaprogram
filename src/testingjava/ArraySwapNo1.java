package testingjava;

import java.util.Arrays;

public class ArraySwapNo1 {
    /**
     * This method will swap the data of alternative position
     *
     * @param input This method take an integer Array as an argument
     * @return This method return swapped integer Array
     */
    private int[] swapAlternative(int[] input) {
        int[] output = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            if (i % 2 == 0 && i != input.length - 1) {
                output[i] = input[i + 1];
                output[i + 1] = input[i];
            }
            if (i % 2 == 0 && i == input.length - 1) {
                output[i] = input[i];
            }
        }
        return output;
    }


    public static void main(String[] args) {
        ArraySwapNo1 obj = new ArraySwapNo1();
        int[] a = {10, 20, 30, 40, 50};
        int[] o = obj.swapAlternative(a);
        System.out.println(Arrays.toString(o));

    }
}
