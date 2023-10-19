package lab6.ex6;
import java.util.*;

public class Lab6Ex6 {
	public static List<Integer> votersList(Map<Integer, Integer> map){
		List<Integer> ans = new ArrayList<>();
		for(int key : map.keySet()) {
			if(map.get(key) > 18) {
				ans.add(map.get(key));                
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		
		Map<Integer, Integer> map = new HashMap<>();
		map.put(12, 76);
		map.put(32, 12);
		map.put(31, 20);
		map.put(1, 4);
		List<Integer> res = votersList(map);
		System.out.println(res);
	}

}
