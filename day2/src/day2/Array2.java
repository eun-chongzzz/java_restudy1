package day2;

import java.util.ArrayList;
import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		// 다양한 방법으로 ArrayList 만들기
		
		 ArrayList<String> pitches = new ArrayList<>();  // 제네릭스를 사용한 표현
	        pitches.add("138");
	        pitches.add("129");
	        pitches.add("142");
	        System.out.println(pitches);  // [138, 129, 142] 출력
	    }
	
		//하지만 다음처럼 이미 데이터가 존재할경우에는 보다 편하게 ArrayList를 생성할수있따.
		public static void main2(String[] args) {
			String[] data = {"138", "129", "142"};  // 이미 투구수 데이터 배열이 있다.
			ArrayList<String> pitches = new ArrayList<>(Arrays.asList(data));
			System.out.println(pitches);  // [138, 129, 142] 출력
			// asList 메소드를 사용하면 이미 존재하는 문자열 배열로 ArrayList를 생성할 수 있다.
	 }
		
		// 또는 다음과 같이 String 배열 대신 String 자료형을 여러개 전달하여 생성할 수도 있다.
		public static void main3(String[] args) {
			ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
		    System.out.println(pitches);
		    
		    
		    
		   }


		
}