package day4;

public class Method {
	
	// 가장 간단하지만 많은 것을 설명해주는 다음의 메소드를 보자
	
	/*
	int sum(int a, int b) { // a, b는 매개변수
		return a+b;
		}
		
	*/
	// 위 메소드의 의미는 다음과같이 정의된다.
	// "sum 메소드는 입력값으로 두개의 값(a,b)을 받으며 리턴값은 두개의 입력값을 더한 값이다"
	// return은 메소드의 결과값을 돌려주는 명령어이다.
	// 직접 위의 메소드를 만들어보고 사용해보자.
	public static void main(String[] args) {
		// Method 메소드
		
		// 다른 프로그래밍 언어에는 함수라는 것이 별도로 존재한다.
		// 하지만 자바는 클래스를 떠나 존재하는 것은 있을 수 없기 때문에 자바의 함수는 따로 존재하지않고
		// 클래스 내에 존재한다./
		// 자바는 이러한 클래스 내의 함수를 메소드라고 부른다
		
		// 입력을 가지고 어떤 일을 수행한 다음에 결과물을 내어놓는것, 이것이 메소드가 하는일이다.
		
		// 메소드를 사용하는 이유?
		// 가끔 프로그래밍을 하다보면 독같은 애용을 자신이 반복해서 적고 있는것을 발견한다
		// 이때가 바로 메소드가 필요한 떄이다 
		// 즉, 이것을 한 뭉치로 묶어서 "어떤 입력값을 주었을 때 어떤 리턴값을 돌려준다" 라는 식의 
		// 메소드를 작성하는 것이 현명한 일일 것이다.
		// 가장 간단하지만 많은 것을 설명해주는 다음의 메소드를 보자
		
		
		// int a = 3;
		// int b = 4;
		// Method method = new Method();
		 // int c = method.sum(a, b); // 3, 4는 인수
		
		// System.out.println(c); // 7 출력
		
		// Method 클래스의 main 메소드에서 Method method = new Method()처럼 자기 자신의 객체를 생성했다. 
		// 이것은 당연히 가능한 코드이고 작성한 클래스를 단독으로 실행시켜 테스트할 때 자주 사용하는 방법이다.
		
		
		// 메소드의 입력값과 리턴값
		// 메소는 들어온 입력값을 가지고 어떤 처러리르 하여 적절한 리턴값을 돌려준느 블랙박스와 같다
		// 입력값 -> 메소드 -> 리턴값
		
		// 메소드의 구조 
		// 리턴자료형 메소드명(입력자료형1 매개변수1, 입력자료형2 매개변수2, ...) {
		// ...
		// return 리턴값;  리턴자료형이 void인 경우에는 return문이 필요벗다
		
		// 메소드는 입출력 유무에 따라 다음과 같이 4가지로 분류할 수 있다.
		// 입력과 출력이 모두 있는 메소드
		// 입력과 출력이 모두 없는 메소드
		// 입력은 없고 출력은 있는 메소드
		// 입력은 있고 출력은 없는 메소드 
	}

}
