package day1;

public class Sample6 {
	public static void main(String[] args) {
		// 원시 자료형
		/* 이전에 살펴보았던 int, long, double, float, boolean, char 등을 
		 자바는 원시(primitive) 자료형 이라고 부른다. 
		 이런 primitive 자료형은 new 키워드로 그 값을 생성할 수 없다.
		 primitive 자료형은 다음과 같이 리터럴(literal)로만 값을 세팅할 수 있다.
		 */
		
		boolean result = true;
		char capitalC = 'C';
		int i = 100000;
		
		// 여기서 잠깐, 하나 기억해둘것이 있따.
		// String은 "Happy Java"와 같이 리터럴로 표기가 가능하지만 
		// primitive 자료형은 아니다. String은 리터럴 표현식을 사용할수 있도록 자바에서 특별대우해주는
		// 자료ㅛ형이다
		
		// 원시 자료형의 Wrapper클래스
		// int, long, double, float, boolean, char 등의 원시 자료형은 다음처럼 각각에 대응하는 
		// Wrapper 클래스들이 존재한다
		// int = Integer
		// long = long
		// double = Double
		// float = Float
		// boolean = Boolean
		// char = Char
		
		// 앞으로 공부할 ArryList, HashMap, HashSet 등은 데이터 저장시 원시 자료형 대신
		// 그에 대응하는 Wrapper 클래스들을 사용해야한다.
		// 원시 자료ㅛ형 대신 Wrapper클래스를 사용하면 값 대신 객체를 주고 받을 수 있어
		// 코드를 객체 중심적으로 작성하는데 유리하다.
	
	}
}
