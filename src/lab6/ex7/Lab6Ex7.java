package lab6.ex7;
import java.util.*;


public class Lab6Ex7 {
	public static int[] getSorted(int[] arr) {
		int n = arr.length;
		int[] ans = new int[n];
		for(int i = 0; i < n; i++) {
//			int temp = arr[i];
			ans[i] = arr[n-i -1];
			
		}
		
		for (int element : ans) {
            System.out.println(element);
        }
		Arrays.sort(ans);
		return ans;
	}
	
	public static void main(String[] args) {
		int[] arr = {4, 12, 3, 154, 14};
		int[] ans = getSorted(arr);
		System.out.print("After Sorting");
		 for (int element : ans) {
	            System.out.println(element);
	        }
		
}
}
