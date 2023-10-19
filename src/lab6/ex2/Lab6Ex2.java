package lab6.ex2;
import java.util.*;

public class Lab6Ex2 {
	public static Map<Character, Integer> countChars(char[] arr){
		Map<Character, Integer> ans = new HashMap<>();
		for(char val : arr) {
			if(ans.containsKey(val)) {
				ans.put(val, ans.get(val)+1);
			}else {
				ans.put(val, 1);
			}
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		char[] arr = {'a', 'n', 'v', 'r', 'a', 'b', 'a'};
		Map<Character, Integer> res = countChars(arr);
		System.out.println(res);
	}
}
