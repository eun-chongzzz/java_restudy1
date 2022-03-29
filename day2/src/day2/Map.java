package day2;

import java.util.HashMap;

public class Map {
	public static void main(String[] args) {
		// 자바의 맵(Map)은 이러한 대응관계를 쉽게 표현할 수 있게 해 주는 자료형이다
		// 맵(Map)은 사전(dictionary)과 비슷하다. 
		// 즉, people 이란 단어에 "사람", baseball 이라는 단어에 "야구"라는 뜻이 부합되듯이 
		// Map은 Key와 Value를 한 쌍으로 갖는 자료형이다.

		// key  	value
		// people =	사람
		// baseball	= 야구
		
		// ----------------------------------//
		
		// put
		
		 HashMap<String, String> map = new HashMap<>();
	     map.put("people", "사람");
	     map.put("baseball", "야구");
	     
	     System.out.println(map.get("people")); // 사람 출력
	     
	     // 맵의 key에 해당하는 value가 없을 경우에 get 메소드를 사용하면 다음처럼 null이 리턴
	     System.out.println(map.get("java"));  // null 출력
	     // 이때 null 대신 디폴트 값을 얻고 싶은 경우에는 getOrDefault 메소드를 사용
	     System.out.println(map.getOrDefault("java", "자바"));  // "자바" 출력
	     
	     //containsKey 메소드는 맵에 해당 키가 있는지를 조사하여 그 결과값을 리턴
	     System.out.println(map.containsKey("people"));  // true 출력
	     
	     // remove 메소드는 맵의 항목을 삭제하는 메소드로 key값에 해당되는 아이템(key, value)을 삭제한 후 그 value 값을 리턴
	     System.out.println(map.remove("people"));  // "사람" 출력
	     
	     // size 메소드는 Map의 갯수를 리턴
	     System.out.println(map.size());  // 1 출력
	     //  "people"항목이 삭제되었으므로 1이 출력
	}
}
