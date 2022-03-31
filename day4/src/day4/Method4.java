package day4;

public class Method4 {
	
	int a = 1; //객체변수 a
	
	void varTest() {
        this.a++;
    }

	public static void main(String[] args) {
		// 메소드 내에서 선언된 변수의 효력 범위
		// 메소드 안에서 사용하는 변수의 이름을 메소드 밖에서 사용한 이름과 동일하게 사용한다면?
		
		//int a = 1;
		Method4 method4 = new Method4();
		// method4.varTest(a);
		// System.out.println(a);
		
		// 위 예제의 varTest 메소드는 입력으로 들어온 int자료형의 값을 1만큼 증가시키는 역할을한다
		// 당연히 varTest 메소드에서 a의 값을 1만큼 증가시켰으니 2가 출력되어야할것같지만
		// 1이라는 결과값이 나온다
		// 그 이유는 메소드 내에서 사용되는 변수는 메소드 안에서만 쓰여지는 변수이기때문이다
		// 즉 pubilc void varTest(int a) { 라는 문장에서 입력인수를 뜻하는
		// 변수 a는 메소드 안에서만 쓰이는 변수잊이 메소드 밖의 변수 a가 아니라는 ㅡ말이다
		
		// 메소드에서 쓰이는 변수는 메소드 밖의 변수 이름들과는 전혀 상관 없다.
		// 그래서 이렇게 메소드 내에서만 쓰이는 변수를 로컬 변수(local variable)라고도 말한다.
		
		
		// 그렇다면 varTest라는 메소드를 이용해서 메소드 외부의 a를 1만큼 증가시킬 수 있는 방법은 없을까?
		//	a = method4.varTest(a);
		//	System.out.println(a);
		
		// 해법은 위 예처럼 varTest메소드에 return문을 이용한느 방법이다
		// varTest메소드는 입력값으로 들어온값을 1만큼 증가시켜 리턴한다
		// a = method4.varTest(a); 처럼하면 a의 값은 다시 varTest 메소드의 리턴값으로 대입된다
		
		
		// this 활용하기
		// 다음과 같은 문장이 있다
		// method4.varTest(method4);
		// method4 객체를 이용하여 varTest라는 메소드를 호출할 경우 굳이 method4 객체를 전달할 필요가 없다
		// 왜냐하면 전달하지 않더라도 varTest 메소드는 this라는 키워드를 이용하여 객체에 접근할 수 있기 때문이다.
        method4.a = 1;
        method4.varTest();
        System.out.println(method4.a);  // 2 출력
		
	}

}
