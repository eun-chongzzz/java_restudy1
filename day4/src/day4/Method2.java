package day4;

public class Method2 {
	
	int sum(int a, int b) {
		return a + b;
	}
	
	String say() {
		return "Hi";
	}
	
	public static void main(String[] args) {
		// 메소드는 입출력 유무에 따라 다음과 같이 4가지로 분류할 수 있다.
		// 입력과 출력이 모두 있는 메소드
		// 입력과 출력이 모두 없는 메소드
		// 입력은 없고 출력은 있는 메소드
		// 입력은 있고 출력은 없는 메소드 
		
		// sum 메소드의 입출력 자료형은 다음과 같다.
		// 입력값 -int 자료형 a, int 자료형 b
		// 리텀값 int 자료형
		
		// sum 메소드는 두 개의 입력값을 받아서 서로 더한 결과값을 돌려주는 메소드이다.
		// 위처럼 입력값과 리턴값이 있는 메소드는 다음처럼 사용된다
		// 리턴값받을변수 = 객체.메소드명(입력인수1, 입력인수2, ...)
		Method2 method2 = new Method2();
		int result = method2.sum(3,4);
		// 위에서 보듯이 method2.sum(3,4) 호출 후 리턴값을 저장하는 result의 자료형은
		// int로 해야한다 왜냐면 sum 메소드의 리턴타입이 int로 되어있기 때문이다
		// sum 메소드의 리턴타입은 int sum(int a,int b){... 에서 보듯이 메소드명 바로 좌측에 
		// 표기하도록 되어있다.
		
		
		// 입력값이 없는 메소드 
		// String say() {
		//	return "Hi";
		// }
		
		// say메소드의 입출력 자료형은 다음과 같다.
		// 입력값 - 없음
		// 리턴값 - String 자료형
		
		// say라는 이름의 메소들르 만들었다 하지만 입력 인수부분을 나타내는 괄호 안이 비어있다
		// 이 메소드는 어떠헥 쓸수 있을까?
		String a = method2.say();
		System.out.println(a); 
		// say메소드를 쓰기 위해서는 say()처럼 괄호안에 아무런 값도 넣지 않고 써야한다.
		// say 메소드는 입력값은 없지만 리턴값으로 'Hi'라는 문자열을 돌려준다.
		// 따라서 String a = method2.say() 처럼 하면 a에는 "Hi"라는 문자열이 대입도니다.
		// 리턴값받을 변수 = 객체.메소드명()
	}

}
