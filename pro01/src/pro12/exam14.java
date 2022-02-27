package pro12;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class exam14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("A", "aa");
		map.put("B", "bb");
		
		
		Set<String> keySet = map.keySet();
		System.out.println(keySet);
		
		
		System.out.println();
		
		
		for (Map.Entry<String, String> e : map.entrySet()) {
			String key = e.getKey();
			String value = e.getValue();
			System.out.println(key + " : " + value);
		}

	}

}
