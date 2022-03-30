package day3;

public class Calculator {
	
	static int result = 0;
	
	static int add(int num) {
		result += num;
		return result;
	}
	// add 메소는 매개변수 num으로 받은값을 이전에 계산한 결과값에 더한 후 돌려주는 메소드이다.
	// 이전에 계산한 결과값을 유지하기 위해서 result 전역변수(static)를 사용했따.
	
	// 그런데 만일 Sample1 클래스에서 2대의 계산기가 필요한 상황이라면
	// 각 계산기는 각각의 결과값을 유지해야하기 떄문에 위와같이 Calculater 클래스 하나만으로
	// 결과값을 따로 유지할수 없다.
	// 이러한 상황을 해결하려면 다음과 같이 클래스를 각각 따로 만들어야한다.
public class Calculator1{
	
	static int result = 0;
	
	static int add(int num) {
		result += num;
		return result;
	}
}
	
class Calculator2 {
    static int result = 0;

    static int add(int num) {
        result += num;
        return result;
    }
}

	public static void main(String[] args) {
		System.out.println(Calculator1.add(3));
		System.out.println(Calculator1.add(4));
		
		System.out.println(Calculator2.add(3));
		System.out.println(Calculator2.add(7));
	}
	// 계산기 1의 결과값이 계산기 2에 아무 영향을 끼치지 않음을 확인할수있다.
	// 하지만 계산기가 3개,5개로 점점 많이 필요하다면?
	// 상황은 어려워진다
	
	// 위와같은 경우는 객체를 사용하면 다음과 Calculator2에서 해결할수있따.
}
