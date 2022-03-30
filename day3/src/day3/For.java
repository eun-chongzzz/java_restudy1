package day3;

public class For {

	public static void main(String[] args) {
		// for 문도 while 문과 마찬가지로 문자을 반복해서 수행해야 할 경우에 사용
		
		// for 문의 구조
		// 예1.
		String[] numbers = {"one", "two", "three"};
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		// numbers 배열의 첫번째 요소부터 마지막 요소까지 출력하는 예이다.
		// for문의 조건문은 세미콜론(;)을 구분자로 세 부분으로 나뉘어진다.
		
		// for(초기치; 조건문, 증가치){
		// ...
		// }
		
		// 위 예에서 초기치는 int i=0 이 되고 조건문은 i<numbers.length 그리고 증가치는 i++
		// 즉 i값이 numbers의 갯수보다 작은 동안 계속 i값을 1씩 증가시킨다는 의미
		
		
		// for 문의 예제
		// "총 5명의 학생이 시험을 봤는데 시험점수가 60점이 넘으면 합격, 그렇지 않으면 불합격.
		// 합격인지 불합격인지에 대한 결과를 보여준다."
		
		int[] marks = {90, 25, 67, 45, 80};
		for(int i=0; i<marks.length; i++) {
			if(marks[i] >= 60) {
				System.out.println((i+1) + "번 학생은 합격입니다.");
			} else {
				System.out.println((i+1) + "번 학생은 불합격입니다.");
			}
		}
		
		// i값이 1씩 증가하며 for문 안의 문장들이 수행된다. 따라서 marks[i]는 차례로
		// 90,25,67,45,80의 값을 갖게 된다. i가 marks의 갯수인 5보다 크게되면 for문은 중지
		
		
		// for와 continue
		
		// while문에서 알아보았던 continue가 for문에도 동일하게 적용된다.
		// for문 안의 문장을 수행하는 도중에 continue문을 만나면 for문의 처음으로 돌아간다.
		// 위의 예제를 그대로 이용해서 60점 이상인 사람에게는 축하메세지를, 
		// 나머지 사람에게는 아무런 메세지도 전하지않는 프로그램을 만들어보자.
		
		for(int i=0; i<marks.length; i++) {
			if(marks[i] < 60) {
				continue;
			}
			System.out.println((i+1) + "번 학생 축하합니다. 합격입니다.");
		}
		// 점수가 60점 미만인 학생일 경우에는 marks[i] < 60 이 참이 되어 continue문이 수행됨.
		// 따라서 축하 메세지를 출력하는 부분을 수행하지 않고 for문의 첫 부분으로 돌아가게 됨
		// while 문과 마찬가지로 for문안에서 break문장을 만나면 for문을 벗어난다.
		
		
		// 이중 for 문
		
		// for 문을 두 번 이용하면 아주 간단하게 구구단을 출력할수 있다.
		
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.print(i*j+" ");
			}
			System.out.println("");
		}
		// 위의 예를 보면 for가 두번 사용되었따. 먼저 2부터 9까지의 숫자가 차례로 i에 대입된다.
		// i가 2일때 다시 for문을 만나게 된다. 이제 1부터 9까지의 숫자가 j에 대입되고
		// 그 다음문장인 System.out.println(i*j+" "); 를 수행한다
		// 그 다음부터는 i가 9일때까지 계속 반복하게 된다.
	}
}
