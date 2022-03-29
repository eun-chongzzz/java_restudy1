package day1;

public class Sample8 {
	public static void main(String[] args) {
		//indexOf
		// indexOf는 문자열에서 특정 문자가 시작되는 위치(인덱스)를 리턴한다.
		// 다음과 같은 문자열을 보자
		
		String a = "Hello Java";
		
		// 위와같은 a 문자열에서 "Java"라는 문자열이 시작되는 위치를 알고 싶은경우
		// indexOf를 다음과 같이 ㅅ ㅏ용할 수 있다.
		System.out.println(a.indexOf("Java")); // 6 출력
		
		// "Hello Java"라는 문자열에서 "Java"라는 문자열은 일곤번째 문자부터 시작이다.
		// 결과값이 6으로 나온이유는 자바는 숫자를 0부터 세기 때문이다.
}
}
