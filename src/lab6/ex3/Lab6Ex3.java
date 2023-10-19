package lab6.ex3;
import java.util.*;

public class Lab6Ex3 {
	public static Map<Integer, Integer> getSquares(int[] arr){
		Map<Integer, Integer> ans = new HashMap<>();
		for(int val : arr) {
			ans.put(val, val*val);
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		int[] arr = {4, 44, 6, 12, 3};
		Map<Integer, Integer> res = getSquares(arr);
		System.out.println(res);
	}
}
