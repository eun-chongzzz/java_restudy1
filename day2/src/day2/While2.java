package day2;

public class While2 {

	public static void main(String[] args) {
		// 무한루프(Loop)
		// 자바에서 무한루프는 while문으로 구현
		
		// 기본 구조
		/*while(true) {
			<수행할 문장1>;
		    <수행할 문장2>;
		    ...
		} */
		
	/*	while (true) {
		    System.out.println("빨간색 버튼을 누르면 종료됩니다.");
		} */
		
		
		// whil문 빠져 나가기(break)
		
		 int coffee = 10;
		 int money = 300;
		 
		 while (money > 0) {
			 System.out.println("돈을 받았으니 커피를 줍니다.");
			 coffee--;
			 System.out.println("남은 커피의 양은 " + coffee + "입니다.");
			 if (coffee == 0) {
				 System.out.println("커피가 다 떨어졌습니다. 판매를 중지합니다.");
				 break;
			 }
		 }  // while (money > 0)에서 money는 0보다 크기 때문에 항상 참
		 	// coffee--에 의해서 coffee의 개수가 한 개씩 줄어들게 된다.
		 	// 만약 coffee가 0이 되면 if (coffee == 0) 문장이 참이 되므로 break가 호출
	
	
	
		// while문 조건문으로 돌아가기(continue)
		// 만약 1부터 10까지의 수중에서 홀수만을 출력
		int a = 0;
		
		while (a < 10) {
			a++;
			if(a % 2 == 0) {
				continue; // 짝수인 경우 조건문으로 돌아간다.
			}
			System.out.println(a); // 홀수만 출력된다
		} 
		// a가 10보다 작은 동안 a는 1만큼씩 계속 증가
		// if (a % 2 == 0) (2로 나누었을 때 나머지가 0인 경우)이 참이 되는 경우는 a가 짝수
		// continue문은 while문의 맨 처음(조건문: a<10)으로 돌아가게 하는 명령어
	}	
}
