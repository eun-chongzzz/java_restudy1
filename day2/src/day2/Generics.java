package day2;

import java.util.ArrayList;

public class Generics {

	public static void main(String[] args) {
		// 제네릭스(Generics) 는 자바 J2SE 5.0 이후에 도입된 개념
		
		// ArrayList<String> pitches = new ArrayList()<String>(); 자료형을 적지않아도 명확해서 
		
		// ArrayList<String> pitches = new ArrayList<>(); // 를 선호한다
		
		
		// ArrayList pitches = new ArrayList(); // 제네릭스 도입되기전.
		//<String> 과 같은 문구가 있냐 없냐 차이
		
		// 위에서 사용한 첫번째 코드의 <String> 이라는 제네릭스 표현식은 "ArrayList 안에 담을 수 있는 자료형은 String 타입 뿐이다" 라는 것을 의미
		// 여기서는 제네릭스의 타입으로 String 자료형만을 예로 들었지만 <Integer>, <Animal>, <Dog> 등 어떤 자료형도 사용할 수 있다.
		
		/* ArrayList pitches = new ArrayList();
		pitches.add("138");
		pitches.add("129");

		String one = (String) pitches.get(0);
		String two = (String) pitches.get(1); */
		// 위처럼 제네릭스를 사용하지않으면 Object자료형으로 인식됨
		// Object자료형은 pitches에 값을 넣을떄는 문제가 안되지만
		// 가져올경우 항상 String으로 형변환을 해주어야한다
		// String one1 = (String) pitches.get(0); // Object 자료형을 String 자료형으로 캐스팅한다
		
		// 위 코드를 변경하려면 다음과 같이 된다/
		ArrayList<String> pitches = new ArrayList<>();
		pitches.add("138");
		pitches.add("129");

		String one = pitches.get(0);  // 형 변환이 필요없다.
		String two = pitches.get(1);  // 형 변환이 필요없다.
		
		// 파일러가 pitches에는 반드시 String 자료형만 추가 되어야 함을 알기 때문이다. 
		// 이렇게 제네릭스를 이용하면 형변환에 의한 불필요한 코딩과 잘못된 형변환에 의한 런타임 오류를 방지할 수 있다.
	}

}
