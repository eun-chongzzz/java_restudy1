package day4;
	
/* class Animal {
	String name;
	
	public void setName(String name) {
		this.name = name;
	}
}
 */
public class Sample3 {

	public static void main(String[] args) {
		// 메소드
		// 이제 객체변수에 접근하는 방법과 현재 값이 할당되어 있지 않은 상태에 대해서 알게되었따
		// 이제 객체 변수의 값을 대입하는 방법에 대해서 알아보자.
		// 객체 변수에 값을 대입하는 방법에는 여러가지가 있지만 여기서는 가장 보편적인 메소드를
		// 이용하는 방법에 대해서 알아보자.
		
		// 클래스에는 객체 변수와 더불어 메소드(Method)라는 것이 있다.
		// 메소드는 클래스 내에 구현된 함수를 의미하는데 보통 함수라고 말하지 않고 메소드라고 말한다.
		
		// 이제 메소드를 이용하여 Animal클래스의 객체 변수인 name에 값에 대입해 보자
		
		// Animal 클래스에 추가된 setName 메소드는 다음과 같은 형태의 메소드이다.
		// 입력 : String name
		// 출력 : void(리턴값 없음)
		// 즉, 입력으로 name이라는 문자열을 받고 출력은 없는 형태의 메소드이다.
		// 메소드의 입출력에 대한 자세한 내요은 다음 장에 준비되어 있따.
		
		// 이번에는 setName 메소드의 내부를 살펴보자. setName 메소느는 다음의 문장을 가지고 있다.
		// this.name = name;
		// 객체 변수에 접근하기 위해서 객체.변수 와 같이 도트연산자 로 접근할수 있었던 것과 마찬가지로
		// 객체가 메소드를 호출하기 위해서는 객체.메소드 로 호출해야한다.
		// 즉, 우리가 만든 setName메소드를 호출하려면 다음과 같이 호추해야한다.
		// cat.setName("body");
		
		
		/*
		Animal cat = new Animal();
		cat.setName("body");
		System.out.println(cat.name);
		*/
		
		
		// 이렇게 수정하면 cat.name을 출력하기전에 setName 메소드가 먼저 호출될것이다 
		
		// 이제 아까 setName 메소드의 다음 문장을 다시 보자
		// this.name = name;
		
		// main메소드에서 cat.setName("body") 와같이 "body"라는 입력값으로 setName메소드를
		// 호출했기 때문에 setName함수의 입력항목 name에는 "body"라는 문자열이 전달될것이다
		// 따라서 setName 메소드의 this.name = name; 문장은 다음과 같이 해석되어 질것이다.
		// this.name = "body";
		// setName 메소드 내부에 사용된 this는 Animal 클래스에 의해서 생성된 객체를 지칭한다.
		// 만약 Animal cat = new Animal() 과 같이 cat이라는 객체를 만들고
		// cat.setName("body")와 같이 cat객체에 의해 setName 메소드를 호출하면 
		// setName메소드 내부에 선언된 this는 바로 cat 객체를 지칭한다.
	}

}
