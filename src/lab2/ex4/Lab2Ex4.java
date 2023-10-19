package lab2.ex4;
import java.util.*;

public class Lab2Ex4 {
	public static int[] modifyArray(int[] arr) {
		HashSet<Integer> uniqueSet = new HashSet<>();
        for (int num : arr) {
            uniqueSet.add(num);
        }

        // Convert the unique set back to an array
        int[] uniqueArray = new int[uniqueSet.size()];
        int index = 0;
        for (int num : uniqueSet) {
            uniqueArray[index] = num;
            index++;
        }

        // Sort the array in descending order
        Arrays.sort(uniqueArray);
        for (int i = 0; i < uniqueArray.length / 2; i++) {
            int temp = uniqueArray[i];
            uniqueArray[i] = uniqueArray[uniqueArray.length - 1 - i];
            uniqueArray[uniqueArray.length - 1 - i] = temp;
        }

        return uniqueArray;
	}
	
	public static void main(String[] args) {
        int[] arr = {3, 1, 2, 2, 4, 5, 1, 3};
        int[] result = modifyArray(arr);

        System.out.println("Input Array: " + Arrays.toString(arr));
        System.out.println("Resulting Array: " + Arrays.toString(result));
    }
}
