package lab6.ex5;
import java.util.*;

public class Lab6Ex5 {
	public static int getSecondSmallest(int[] arr) {
		Arrays.sort(arr);
		return arr[1];
	}
	public static void main(String[] args) {
		int[] arr = {4, 44, 6, 12, 3};
		int res = getSecondSmallest(arr);
		System.out.println(res);
	}
}
