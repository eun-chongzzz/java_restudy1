package day4;

class Animal {
	String name;
	
	public void setName(String name) {
		this.name = name;
	}
}
public class Sample4 {

	public static void main(String[] args) {
		Animal cat = new Animal();
		cat.setName("body");
		
		Animal dog = new Animal();
		dog.setName("happy");
		
		// cat객체에는 "body"라는 이름을, dog객체에는 "happy"라는 이름을 대입했다.
		// 이렇게 하면 setName 메소드에 의해 다음과 같은 문장이 두번 실행될것이다,
		// cat.name = "body";
		// dog.name = "happy";
		// 이럴결우 dog.name = "happy" 라는 문장이 나중에 수행되므로 cat.name의값도
		// "happy"라는 값으로 변경되지는 않을까? Animal 클래스의 객체변수 name이 cat객체와 
		// dog객체간 서로 공유되는 변수라면 아마도 그럴것이다
		// 다음과 같이 확인해보자
		System.out.println(cat.name);
		System.out.println(dog.name);
		// 결과를 보면 name 객체 변수는 공유되지 않는것을 확인할수있따.
		
		// 클래스에서 가장 중요한 부분은 객체 변수의 값이 독립적으로 유지된다는 점이다.
		// 이점에서 바로 클래스 존재의 이유이기도하다 
		// 객체지향적이라는 말의 의미도 곱씹어보면 결국 이 객체 변수의 값이 독립적으로
		// 유지되기 때문에 가능한것이다
	}

}
