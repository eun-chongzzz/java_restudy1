package day1;

public class Sample92 {
	public static void main(String[] args) {
		// 포맷 코드와 숫자 함께 사용하기
		// 위에서 보았듯이 %d, %s 등의 포맷 코드는 문자열 안에 어떤 값을 삽입하기 위해 사용한다. 하지만 포맷 코드를 숫자와 함께 사용하면 더 유용하게 사용할 수 있다. 다음 예를 보고 따라해 보자.

		//정렬과 공백

		System.out.println(String.format("%10s", "hi"));  // "        hi" 출력
		// 앞의 예문에서 %10s는 전체 길이가 10개인 문자열 공간에서 대입되는 값을 오른쪽으로 정렬하고 그 앞의 나머지는 공백으로 남겨 두라는 의미이다.

		// 그렇다면 반대쪽인 왼쪽 정렬은 %-10s가 될 것이다.

		System.out.println(String.format("%-10sjane.", "hi"));  // "hi        jane." 출력
		//hi를 왼쪽으로 정렬하고 나머지는 공백으로 채웠음을 볼 수 있다.

		
		
		//소수점 표현하기

		System.out.println(String.format("%.4f", 3.42134234));  // 3.4213 출력
		// 3.42134234를 소수점 네 번째 자리까지만 나타내고 싶은 경우에는 위와 같이 사용한다.
		// 즉 여기서 '.'의 의미는 소수점 포인트를 말하고 그 뒤의 숫자 4는 소수점 뒤에 나올 숫자의 개수를 말한다.

		System.out.println(String.format("%10.4f", 3.42134234));  // '    3.4213' 출력
		// 위 예는 숫자 3.42134234를 소수점 네 번째 자리까지만 표시하고 전체 길이가 10개인 문자열 공간에서 오른쪽으로 정렬하는 예를 보여 준다.

		
		// ===================================//
		
		//System.out.printf
		
		//String.format 메소드는 포매팅된 문자열을 리턴한다. 따라서 포매팅된 문자열을 출력하려면 다음처럼 System.out.println 메소드를 함께 사용해야 한다.

		System.out.println(String.format("I eat %d apples.", 3));  // "I eat 3 apples." 출력
		// 하지만 System.out.printf 메소드를 사용하면 String.format 메소드 없이도 동일한 형식으로 포매팅된 문자열을 출력할 수 있다.

		System.out.printf("I eat %d apples.", 3);  // "I eat 3 apples." 출력
		// String.format 과 System.out.printf의 차이는 전자는 문자열을 리턴하는 메소드이고 후자는 문자열을 출력하는 메소드라는 점이다. 상황에 맞게 선택하여 사용하자.
	}
}
