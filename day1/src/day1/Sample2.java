package day1;

public class Sample2 {

	public static void main(String[] args) {
		// 증감 연산(++,--)
		// 자바는 ++,-- 기호를 이용하여 값을 증가하거나 감소시킬수 있다.
		// 이러한 ++,-- 기호를 증감연산자라고도 한다.
		
		int i = 0;
		//int j = 10;
		//i++;
		//j--;
		
		System.out.println(i); // 1 출력
		//System.out.println(j); // 9 출력
		
		// ++는 값을 1만큼 증가시키고 --는 값을 1만큼 감소시킨다는것을 확인할수있다.
		// 하지만 여기서 잠깐 실수하기 쉬운것이 있다. 그것은 바로 ++,-- 등의 연산자의 위치이다.
		
		//System.out.println(i++); // 0 출력
		//System.out.println(i); // 1 출력
		
		// System.out.println(i++); 의 출력값은 i가 1만큼 증가되어 1이 출력되어야 할것같지만 0이 출력되었다.
		// 그렇다면 변수 i의 값이 증가되지 않은것일까? 그 다음 문장인 System.out.println(i);의 출력값을 확인해보니 1이 나온다.
		// 그렇다면 i의 값은 증가된것이다.
		// 이런결과가 나오는 원인은 변수 ++ㅇ 연산자의 위치때문이다. 즉 i++와 같이 ++연산자가 변수명뒤에 붙으면
		// 해당코드가 실행되는 순간에는 i값이 변경되지않는다. 다만 i++ 문장이 실행된 이후에 i값이 증가하게 된다.
		// 이와는 반대로 i++ 대신 ++i라고 사용하게 되면 i값이 먼저 증가된 후에 해당 코드가 실행된다.
		
		// 즉, 다음과 같은 차이가 있으니 잊지 말도록 하자.
		// i++ : 값이 참조된후에 증가
		// ++i : 값이 참조되기전에 증가
		
		System.out.println(++i); //1 출력
		System.out.println(i); // 1출력
		
		// ++i에 의해서 i값이 참조되기 전에 증가된것을 확인할수 있따.

	}

}