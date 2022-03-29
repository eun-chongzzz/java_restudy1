package day2;

public class If {

	public static void main(String[] args) {
		// "돈이 있으면 택시를 타고 가고 돈이 없으면 걸어 간다."
		
		/* boolean money = true;
		if(money) {
			System.out.println("택시를 타고 가라");
		} else {
			System.out.println("걸어가라");
		} */
		
		
		// if문의 기본구조
		
		/* if (조건문) {
		    <수행할 문장1>;
		    <수행할 문장2>;
		    ...
		} else {
		    <수행할 문장A>;
		    <수행할 문장B>;
		    ...
		} */
		// 조건문이 true면 if문, false면 else문
		
		// ----------------------------------------//
		
		// 비교연산자

		// 비교연산자	설명
		//x < y		x가 y보다 작다
		//x > y		x가 y보다 크다
		//x == y	x와 y가 같다
		//x != y	x와 y가 같지 않다
		//x >= y	x가 y보다 크거나 같다
		//x <= y	x가 y보다 작거나 같다
		
		int x = 3;
		int y = 2; 
		System.out.println(x > y); // true
		System.out.println(x < y); // false
		System.out.println(x != y);  // true
		
		// "만약 3000원 이상의 돈을 가지고 있으면 택시를 타고 그렇지 않으면 걸어가라"
		int money = 2000;
		if(money >= 3000) {
			System.out.println("택시를 태고가라");
		} else {
			System.out.println("걸어가라");
		} // 조건문이 거짓이기에 걸어가라 출력
	}

}
