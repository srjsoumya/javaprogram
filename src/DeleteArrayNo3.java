public class DeleteArrayNo3 {
    /**
     * This method delete the element from an Array at respective position
     *
     * @param input    This is the array which is given to the method
     * @param position This is position in which data to be inserted
     * @return This method will return deleted array
     */
    private int[] delete(int[] input, int position) {
        int[] output = new int[input.length - 1];
        for (int i = 0; i < output.length; i++) {
            if (i < position - 1) {
                output[i] = input[i];
            } else if (i >= position - 1) {
                output[i] = input[i + 1];
            }
        }
        return output;

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
        DeleteArrayNo3 obj = new DeleteArrayNo3();
        int[] array = {10, 20, 30, 40, 50};
        int[] output = obj.delete(array, 1);
        obj.display(output);
        output = obj.delete(array, 5);
        obj.display(output);
    }
}
