package day1;

public class Sample0 {

	public static void main(String[] args) {
		// 정수
		int age = 10;
		long countOfStar = 8764827384923849L; 
		// long 변수에 값을 대입할 때는 대입하는 숫자의 값이 int 자료형의 최대값인 2147483647 보다
		// 큰 경우 8764827384923849L 과 같이 L 접미사(또는 소문자 l)을 붙여주어야 한다.
		// 만약 큰 숫자에 L과 같은 접미사를 누락하면 컴파일 에러가 발생.
		
		// 실수
		// 자바의 실수를 표현하기 위한 자료형은 fload, double이다.
		// float와 double의 차이 역시 표현할 수 있는 숫자의 범위이다
		float pi = 3.14f;
		double morePi = 3.14159265358979323846;
		// 자바에서 실수형은 디폴드가 double이므로 위의 예에서 보듯이 float 변수 값을 대입할 떄에는
		// 3.14F 와 같이 F접미서(또는 소문자 f)를 꼭 붙여줘야 한다.
		// 접미사 누락시 컴파일 에러 발생
		// 또는 과학적 지수 표현식으로 다음과 같이 사용 할 수 있다.
		double d1 = 123.4;
		double d2 = 1.234e2;
		// d1과 d2 의 값은 123.4로 같다. d2의 e2는 10의 제곱을 의미한다
		
		// 8진수와 16진수
		// 8진수와 16진수는 int 자료형을 사용하여 표시한다.
		// 0으로 시작하면 8진수, 0x로 시작하면 16진수가 된다
		
		int octal = 023; // 십진수 : 19
		int hex = 0xC; // 십진수 : 12
		
		// 023과 0xC에 해당하는 십진수 값은 각각 19,12이다.
	}

}
