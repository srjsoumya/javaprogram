package testingjava;

import java.util.Arrays;

public class RemoveDuplicateArrayNo13 {
    private int[] removeDuplicate(int[] array) {
        int cnt = 0;
        boolean flag = true;
        int[] output = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            flag = true;
            for (int j = 0; j < array.length; j++) {
                if (i != j) {
                    if (array[i] == array[j]) {
                        flag = false;
                    }
                }
            }
            if (flag) {
                output[cnt++] = array[i];
                flag = true;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        RemoveDuplicateArrayNo13 obj = new RemoveDuplicateArrayNo13();
        int[] array = {0, 10, 50, 20, 50, 20, 40, 60};
        int[] output = obj.removeDuplicate(array);
        System.out.println(Arrays.toString(output));

    }
}
