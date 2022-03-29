package day1;

public class Sample1 {
	public static void main(String[] args) {
		// 숫자연산
		// 자바의 사칙연산은 실생활에서 일반적으로 사용하는 사칙연산과 다를 바가 없다.
		// 자바는 +,-,*,/ 기호를 이용하여 두 숫자간 사칙연산을 수행한다
		// 다음과 같이 사칙연산을 수행하는 자바프로그램을 작성해보자.
		
		int a = 10;
		int b = 5;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		
		// 프로그래밍을 접해 본적이 없는 독자라면 % 연산자는 본 적이 없을것이다.
		// %는 나머지 값을 반환하는 연산자이다. 7을 3으로 나누면 나머지는 1이 될것이고 3을 7로 나누면
		// 나머지는 3이 될것이다
		
		System.out.println(7 % 3); // 1출력
		System.out.println(3 % 7); // 3출력
		
	}
}
