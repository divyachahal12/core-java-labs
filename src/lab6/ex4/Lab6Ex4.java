package lab6.ex4;
import java.util.*;

public class Lab6Ex4 {
	public static HashMap<Integer, String> getStudents(HashMap<Integer, Integer> map){
		HashMap<Integer, String> ans = new HashMap<>();
		for(int key : map.keySet()) {
			if(map.get(key) >= 90) {
				ans.put(key, "Gold");
			}else if(map.get(key) >= 80 && map.get(key) < 90) {
				ans.put(key, "Silver");
			}else if(map.get(key) >=70 && map.get(key) < 80) {
				ans.put(key, "Bronze");
			}else {
				ans.put(key, "");
			}
		}
		return ans;
	}
public static void main(String[] args) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(12, 76);
		map.put(32, 12);
		map.put(31, 98);
		map.put(1, 82);
		HashMap<Integer, String> res = getStudents(map);
		System.out.println(res);
	}
}
