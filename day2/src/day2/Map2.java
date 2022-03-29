package day2;

import java.util.ArrayList;
import java.util.HashMap;

public class Map2 {

	public static void main(String[] args) {
		// keySet
		// keySet은 맵(Map)의 모든 Key를 모아서 리턴
		
		 HashMap<String, String> map = new HashMap<>();
	        map.put("people", "사람");
	        map.put("baseball", "야구");
	        System.out.println(map.keySet());  // [baseball, people] 출력
	        
	        // Set 자료형은 다음과 같이 List 자료형으로 바꾸어 사용할수도 있음
	        // List<String> keyList = new ArrayList<>(map.keySet());
	}

}
