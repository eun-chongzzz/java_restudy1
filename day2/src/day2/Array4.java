package day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Array4 {
	public static void main(String[] args) {
		// 리스트 정렬
		// 순서대로 정렬하기 위해서는 다음처럼 리스트의 sort 메소드를 사용
		 ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
	        pitches.sort(Comparator.naturalOrder());  // 오름차순으로 정렬
	        System.out.println(pitches);  // [129, 138, 142] 출력
	        
	        // 오름차순(순방향) 정렬 - Comparator.naturalOrder()
	        // 내림차순(역방향) 정렬 - Comparator.reverseOrder()
	}
}
