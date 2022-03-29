package day2;

import java.util.ArrayList;

public class List {
	public static void main(String[] args) {
		
		// ArrayList
		
		// add 
		// 박찬호 선수가 총 3번의 투구를 138, 129, 142(km) 의 속도록 던졌다면 다음과 같이 코드를 작성할 수 있다.
		
		 ArrayList<String> pitches = new ArrayList<>();
	        pitches.add("138");
	        pitches.add("129");
	        pitches.add("142");
	        
	    // 첫번째 위치에 "133"이라는 투구 스피드 삽입하고싶다면
	        pitches.add(0, "133");
	    // 2번째 위치에 "133" 삽입경우
	        pitches.add(1,"133");
	    
	    //get 출력
	    System.out.println(pitches.get(1));
	    
	    // size ArrayList 갯수 리턴
	    System.out.println(pitches.size());
	    	
	    // contains  리스트 안에 해당항목 있는지 판별, boolean으로 리턴
	    System.out.println(pitches.contains("142"));
	    
	    // remove
	    
	    // 1.remove(객체)
	    // 2.remove(인덱스)
	    
	    // remove(객체) 해당항목을 삭제하고 삭제한결과를 true, false로 리턴
	    System.out.println(pitches.remove("129"));
	    
	    // remove(인덱스) 해당학목을 삭제하고 삭제된 값을 리턴
	    System.out.println(pitches.remove(0));
	}
}
