package day3;

public class Calculator2 {
	int result = 0;
	
	int add(int num) {
		result += num;
		return result;
	}
	
	int sub(int num) {
		result -= num;
		return result;
	}
	
	public static void main(String[] args) {
		Calculator cal1 = new Calculator(); // 계산기1 객체를 생성한다.
		Calculator cal2 = new Calculator(); // 계산기2 객체를 생성한다.
		
		System.out.println(cal1.add(3));
		System.out.println(cal1.add(4));
		
		System.out.println(cal2.add(3));
		System.out.println(cal2.add(7));
	}
	// Calculator 클래스로 만든 별개의 계산기 cal1, cal2(이것을 객체라고 부른다)가 각각의 역할을 수행한다.
	// 객체를 사용하면 계산기 대수가 늘어나더라도 객체만 생성하면 되기 떄문에 클래스만을 사용하는 경우와 달리 매우
	// 간단해진다.
	// 만약 빼기 기능을 추가하려면 Calculator클래스에 다음처럼 sub메소드를 추가하면 된다.
	
	// 객체지향 프로그래밍이 이점은 단순히 이것만이 아니다. 
	// 하지만 이것 ㅓ하나만으로도 "도대체 왜 객체가 필요한것일까?" 라는 근본적인 물음에 해답이 되었을것이다 
}
