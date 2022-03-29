package day2;

import java.util.ArrayList;

public class If2 {
	public static void main(String[] args) {
		// 외에도 조건 판단에 쓰이는 and, or, not 연산자가 있다.
		
		// x || y - x와 y 둘 중 적어도 하나가 참이면 참이다
		// x && y - x와 y 모두 참이어야 참이다
		//   !x - x가 거짓이면 참이다
		
		// "돈이 3000원 이상 있거나 카드가 있다면 택시를 타고 그렇지 않으면 걸어가라"
		
		int money = 2000;
		boolean hasCard = true;
		
		if(money>=3000 || hasCard) {
			System.out.println("택시를 타고가라");
		}else {
			System.out.println("걸어가라");
		} // hasCard가 true이기 때문에 조건문이 참이 되어 "택시를 타고 가라"가 출력
		
		// ==============================================//
		
		// contains
		// List 자료형에는 해당 아이템이 있는지 조사하는 contains 메소드가 있음
		
		// "만약 주머니에 돈이 있으면 택시를 타고, 없으면 걸어가라"
		ArrayList<String> pocket = new ArrayList<String>();
		pocket.add("paper");
		pocket.add("handphone");
		pocket.add("money");

		if (pocket.contains("money")) {
		    System.out.println("택시를 타고 가라");
		}else {
		    System.out.println("걸어가라");
		} // pocket 리스트에 안에 'money'가 있으므로 pocket.contains("money")가 참이 되어 "택시를 타고 가라"가 출력
		
		
		
		// else if(다중 조건 판단)
		// "지갑에 돈이 있으면 택시를 타고, 지갑엔 돈이 없지만 카드가 있으면 택시를 타고, 돈도 없고 카드도 없으면 걸어가라“
		
		boolean hasCard1 = true;
		ArrayList<String> pocket1 = new ArrayList<String>();
		pocket1.add("paper");
		pocket1.add("handphone");

		/*if (pocket.contains("money")) {
		    System.out.println("택시를 타고 가라");
		}else {
		    if (hasCard) {
		        System.out.println("택시를 타고 가라");
		    }else {         
		        System.out.println("걸어가라");
		    }
		} */
		
		// else if문으로 바꾸기
		
		if(pocket1.contains("money")) {
			System.out.println("택시타고 가라");
		} else if(hasCard1) {
			System.out.println("택시타고 가라");
		} else {
			System.out.println("걸어가라");
		} 
		// else if는 이전 조건문이 거짓일 때 수행
		// pocket.contains("money") 문장이 거짓이므로 else if 문이 수행되고 hasCard가 true이므로 "택시를 타고 가라"가 출력
		
		
		// else if 문의 기본구조 
		
		/* if (조건문) {
		    <수행할 문장1> 
		    <수행할 문장2>
		    ...
		}else if (조건문) {
		    <수행할 문장1>
		    <수행할 문장2>
		    ...
		}else if (조건문) {
		    <수행할 문장1>
		    <수행할 문장2>
		    ...
		...
		} else {
		   <수행할 문장1>
		   <수행할 문장2>
		   ... 
		} */
	}
}
