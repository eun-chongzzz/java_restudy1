package day1;

public class Sample7 {
	public static void main(String[] args) {
		// 문자열 내장 메소드
		// String 자료형의 내장 메소드 중에서 자주 사용되는 것들에 대해 알아보자.
		
		// equals
		// equals 는 두개의 문자열이 동일한지를 비교하여 결과값을 리턴한다.
		
		String a = "hello";
		String b = "java";
		String c = "hello";
		System.out.println(a.equals(b)); //false
		System.out.println(a.equals(c)); // true
		
		// 문자열의 값을 비교할때는 반드시 equlse를 사용해야한다. 
		// == 연산자를 사용할 경우 다음과 같은 경우가 발생할 수 있다.
		
		String a1 = "hello";
		String b1 = new String("hello");
		System.out.println(a1.equals(b1)); //true
		System.out.println(a1==b1); // false
		
		// 문자열 a1과 b1은 모두 "hello"로 같은값이지만 equals를 호출했을때는 true
		// == 연산자를 이용했을 때는 false를 리턴한다. 
		// a,b는 값은 같지만 서로 다른 객체이다.
		// == 는 두개의 자료형이 동일한 객체인지를 판별할때 사용하는 연산자이기 때문에 false를 리턴한다
	}
}
