package day4;

public class Method3 {
	
	void sum(int a, int b) {
		System.out.println(a+"과 " + b + "의 합은 " + (a+b) + "입니다. ");
	}
	
	void say() {
		System.out.println("Hi");
	}
	
	void sayNick(String nick) {
        if ("fool".equals(nick)) {
            return;
        }
        System.out.println("나의 별명은 "+nick+" 입니다.");
    }
	public static void main(String[] args) {
		// 리턴값이 없는 메소드
		// 위 sum 메소드의 입출력 자료형은 다음과 같다
		// 입력값 -int 자료형 a, int 자료형 b
		// 리턴값 -void(없음)
		
		// 리턴값이 없는 메소드는 명시적으로 리턴타입 부분에 void라고 표기한다.
		// 리턴값이 없는 메소드는 돌려주는 값이 없기 때문에 다음과 같이 사용한다.
		
		Method3 method3 = new Method3();
		method3.sum(3, 4);
		// 객체.메소드명(입력인수, 입력인수2, ...)
		
		// 아마도 여러분은 다음과 같은 질문을 할지도 모른다. 
		// "3과 4의 합은 7입니다." 라는 문장을 출력해 주었는데 왜 리턴값이 없다는 것인가?
		// System.out.println 문은 메소드내에서 사용되어지는 문장일 뿐이다.
		// 돌려주는 값은 당연히 없다. 돌려주는 값은 return 명령어로만 가능하다.
		
		
		
		// 입력값도 리턴값도 없는 메소드 
		// 위 say 메소드의 입출력 자료형은 다음과 같다
		// 입력값 없음
		// 리턴값 void(없음)
		// 이 메소드를 사용하는 방법은 단 한가지이다.
		
		method3.say();
		// 즉, 입력값도 리턴값도 없는 메솓는 다음과 같이 사용된다
		// 객체.메소드명()
		
		
		// return의 또 다름 쓰임새
		// 특별한 경우에 메소드를 빠져나가기를 원할때 return을 단독으로 사용하여 
		// 메소드를 즉시 빠져나가수 있다.
		method3.sayNick("angel");
		method3.sayNick("fool"); // 출력되지 않는다
		
		// sayNick 메소드는 입력으로 받은 문자열 값을 받아서 출력하는 메소드이다.
		/// 이 메소드 역시 리턴값은 없다.
		// 문자열을 출력한다는것과 리턴값이 있다는것은 전혀 다른 말이다.
		// 이 메소드는 입력값으로 "fool"이라는 값이 들어오면 문자열을 출력하지않고
		// 메소드를 즉시 빠져나간다.
		// 이렇게 메소드 수행시 특정조건에 따라 메소드를 즉시 빠져나가고 싶은경우 return문은 이용하면 도니다

	}

}
