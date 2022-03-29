package day1;

public class Sample91 {

	public static void main(String[] args) {
		// 문자열 포매팅
		
		// 문자열에서 또 하나 알아야 할 것으로는 문자열 포매팅이 있다.
		// 이것을 공부하기전에 다음과 같은 문자열을 출력하는 프로그램을 작성했다고 가정해보자
		
		// "현재 온도는 18도입니다."
		
		// 시간이 지나서 20가 되면 다음 문자을 출력한다.
		
		// "현재 온도는 20도 입니다."
		
		// 위 두 문자열은 모두 같은데 20이라는 수자와 18이라는 숫자만 다르다.
		// 이렇게 문자열 아넹 특정한 값을 바꿔야할 경우가 있을 대 이것을 가능하게 해주는 것이 
		// 바로 문자열 포매팅 기법이다
		
		// 쉽게 말해 문자열 포매팅이란 문자열 안에 어떤 값을 삽입하는 방법이다
		
		System.out.println(String.format("I eat %d apple.", 3));
		
		// 문자열 포매팅은 String,format 메소드를 사용한다.
		// 위 결과값을 보면 알겠지만 위 예제는 문자열 안에 정수 3을 삽입하는 방법을 보여준다.
		// 문자열 안에 숫자를 넣고싶은자리에 %d 문자를 넣어주고, 삽입할 숫자 3은 두번쨰 
		// 파라미터로 전달했다. 여기서 %d는 문자열 포맷코드라고 부른다
		
		
		
		// 문자열 바로 대입

		// 문자열 안에 꼭 숫자만 넣으라는 법은 없다. 이번에는 숫자 대신 문자열을 넣어 보자.

		System.out.println(String.format("I eat %s apples.", "five")); 
		// 위 예제에서는 문자열 안에 또 다른 문자열을 삽입하기 위해 앞에서 사용한 문자열 포맷 코드 %d가 아닌 %s를 썼다. 
		// 어쩌면 눈치 빠른 독자는 벌써 유추하였을 것이다. 
		// 숫자를 넣기 위해서는 %d를 써야 하고, 문자열을 넣기 위해서는 %s를 써야 한다는 사실을 말이다.
		
		
		
		// 숫자 값을 나타내는 변수 대입
		int number = 3;
		System.out.println(String.format("I eat %s apples.", number));
		// 1번처럼 숫자를 바로 대입하나 위 예제처럼 숫자 값을 나타내는 변수를 대입하나 결과는 같다.
		
		
		// 2개 이상의 값 넣기
		
		// 그렇다면 문자열 안에 1개가 아닌 여러 개의 값을 넣고 싶을 땐 어떻게 해야 할까?
		
		int number2 = 10;
		String day = "three";

		System.out.println(String.format("I ate %d apples. so I was sick for %s days.", number2, day));
		
		
		
		// 문자열 포맷 코드
		
	
		// 문자열 포매팅 예제에서는 대입해 넣는 자료형으로 정수와 문자열을 사용했으나 이 외에도 다양한 것을 대입할 수 있다.
		// 문자열 포맷 코드로는 다음과 같은 것이 있다.
		//%s = 문자열(String)
		//%c = 문자 1개(character)
		//%d = 정수(Integer)
		//%f = 부동소수(floating-point)
		//%o = 8진수
		//%x = 16진수
		//%% = Literal % (문자 % 자체)
		
		// 여기에서 재미있는 것은 %s 포맷 코드인데, 이 코드는 어떤 형태의 값이든 변환해 넣을 수 있다.
		System.out.println(String.format("I have %s apples",  3));  
		System.out.println(String.format("rate is %s", 3.234));  
		
		// 3을 문자열 안에 삽입하려면 %d를 사용하고, 3.234를 삽입하려면 %f를 사용해야 한다.
		// 하지만 %s를 사용하면 이런 것을 생각하지 않아도 된다. 
		// 왜냐하면 %s는 자동으로 % 뒤에 있는 값을 문자열로 바꾸기 때문이다.
		
		
		
		// -------------------------------------// 
		
		// 포매팅 연산자 %d와 %를 같이 쓸 때는 %%를 쓴다

		// System.out.println(String.format("Error is %d%.", 98));
		
		//위 예문의 결괏값으로 당연히 "Error is 98%."가 출력될 것이라고 예상하겠지만 오류가 발생한다.

		// Exception in thread "main" java.util.UnknownFormatConversionException: Conversion = '.'
	
		//이유는 문자열 포맷 코드인 %d와 %가 같은 문자열 안에 존재하는 경우, %를 나타내려면 반드시 %%로 써야 하는 법칙이 있기 때문이다. 
		// 이 점은 꼭 기억해 두어야 한다. 하지만 문자열 안에 %d 같은 포매팅 연산자가 없으면 %는 홀로 쓰여도 상관이 없다.
		// 따라서 위 예를 제대로 실행하려면 다음과 같이 해야 한다.

		System.out.println(String.format("Error is %d%%.", 98));  // "Error is 98%." 출력
 	}

}
