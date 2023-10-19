package lab6.ex1;
import java.util.*;

public class Lab6Ex1 {
	public static List<Integer> getValue(Map<Integer, Integer> map){
		List<Integer> ans = new ArrayList<>();
		for(int val : map.values()) {
			System.out.println(val);
			ans.add(val);
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, 10);
		map.put(1, 20);
		map.put(2, 12);
		List<Integer> res = getValue(map);
		Collections.sort(res);
		System.out.println(res);
	}
}
