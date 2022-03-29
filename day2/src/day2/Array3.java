package day2;

import java.util.ArrayList;
import java.util.Arrays;

public class Array3 {
	public static void main(String[] args) {
		// ArrayList의 각 요소를 콤마(",")로 구분하여 다음과 같은 하나의 문자열로 만들 수 있는 방법이 있을까?
		
		 /* ArrayList<String> pitches = new ArrayList()<>(Arrays.asList("138", "129", "142"));
	        String result = "";
	        for (int i = 0; i < pitches.size(); i++) {
	            result += pitches.get(i);
	            result += ",";  // 콤마를 추가한다.
	        }
	        result = result.substring(0, result.length() - 1);  // 마지막 콤마는 제거한다.
	        System.out.println(result);  // 138,129,142 출력 */
			
			
		// String.join은 다음처럼 문자열 배열에도 사용할 수 있다.
		  ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
	        String result = String.join(",", pitches);
	        System.out.println(result);  // 138,129,142 출력
	    }
	
		// String.join 메소드는 Java 8 버전부터 사용할 수 있다.
	}


