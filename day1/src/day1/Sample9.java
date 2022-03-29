package day1;

public class Sample9 {
	public static void main(String[] args) {
		// contains
		
		// contains는 문자열에서 특정 문자열이 포함되어있는지 여부를 리턴한다
		
		String a ="Hello Java";
		System.out.println(a.contains("Java"));
		
		// 문자열 a는 "Java"라는 문자열을 포함하고 있기 때문에 true를 리턴한다.
		
		
		// ------------------------------------------ //
		
		// charAt
		
		//charAt은 문자열에서 특정 위치의 문자(char)를 리턴한다.
		//다음과 같은 문자열을 보자.
		//위와 같은 b 문자열에서 "J"라는 문자는 6번째 인덱스에 위치한 문자이다. 
		//6이라는 숫자로 "J"라는 문자를 얻기 위해서는 다음과 같이 charAt을 사용한다.

		
		System.out.println(a.charAt(6));  // "J" 출력
		//"Hello Java" 라는 문자열에서 "J"라는 문자는 일곱번째 문자이다. 
		// 하지만 6으로 문자를 찾아야 하는 이유는 자바는 숫자를 0부터 세기 때문이다.
		
		// -------------------------------------------//
		
		// replaceAll
		
		// replaceAll은 문자열 중 특정 문자열을 다른 문자열로 바꾸고자 할 때 사용한다.
		String b = "Hello Java";
		System.out.println(a.replace("Java", "World"));
		// "Hello Java" 라는 문자열에서 "Java"가 "World"로 바뀌었다.
		
		// -------------------------------------------//
		
		// substring 
		
		// substring은 문자열 중 특정 부분을 뽑아낼 경우에 사용한다
		
		String c = "Hello Java";
		System.out.println(a.substring(0,4));
		//위처럼 substring(시작위치, 끝위치)와 같이 사용하면 문자열의 시작위치에서 끝위치까지의 문자를 뽑아내게 된다. 
		//단 끝위치는 포함이 안된다는 점에 주의하자. 
		//이것은 다음과 같은 수학의 식과 비슷하다.
		
		// 시작위치 <= c < 끝위치
		
		// ------------------------------------//
		
		// toUpperCase
		// toUpperCase는 문자열을 모두 대문자로 변경할 때 사용한다. (모두 소문자로 변경할때는 toLowerCase를 사용한다.)
		
		String d = "Hello Java";
		String d1 = "Hello Java";
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		
		// ======================================//
		
		// split
		
		// split 메소드는 문자열을 특정 구분자로 분리하는 메소드이다.
		
		String e = "a:b:c:d";
		String[] result = a.split(":"); //result 는 {"a","b","c","d"}
		
		// 위의 예처럼 "a:b:c:d" 라는 문자열을 ":" 문자로 나누어 {"a", "b", "c", "d"} 문자열 배열을 만들수 있다.
	}
}
