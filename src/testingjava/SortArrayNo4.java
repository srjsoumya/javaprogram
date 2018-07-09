package testingjava;

public class SortArrayNo4 {
	/**
	 * This method will sort the array in ascending order
	 * 
	 * @param array this is the array given to the method as an argument
	 * @return This will return sorted array
	 */
	private int[] sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
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
		SortArrayNo4 obj = new SortArrayNo4();
		int[] array1 = { 10, 100, 20, 10, 30, 100, 220 };
		int[] output = obj.sort(array1);
		obj.display(output);
		int[] array2 = { 10, 100, 30, 20, 40, 80, 50 };
		output = obj.sort(array2);
		obj.display(output);

	}
}
