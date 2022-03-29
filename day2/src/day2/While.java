package day2;

public class While {

	public static void main(String[] args) {
		// while은 문장을 반복해서 수행해야 할 경우에 사용
		
		// wheil문의 기본 구조
		
		/* while (조건문) {
		    <수행할 문장1>;
		    <수행할 문장2>;
		    <수행할 문장3>;
		    ...
		} */
		
		// "열 번 찍어 안 넘어 가는 나무 없다" 자바로 코딩
		
		int treeHit = 0;
		while (treeHit < 10) {
			treeHit++;
			System.out.println("나무를 " + treeHit + "번 찍었습니다.");
			if(treeHit == 10) {
				System.out.println("나무가 넘어갑니다.");
			}
		}
		// treeHit가 10보다 작은 동안에 while 문 안의 문장들을 계속 수행
		// treeHit++로 treeHit값이 계속 1씩 증가
		// treeHit < 10라는 조건문이 거짓이 되어 while문을 빠져나옴
		// treeHit++ = treeHit += 1
	}

}
