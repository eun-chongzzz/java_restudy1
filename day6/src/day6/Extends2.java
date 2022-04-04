package day6;

public class Extends2 {
	
	class Animal extends Object {
	    String name;
	    
	    void setName(String name) {
	        this.name = name;
	    }
	} 

	// 자바에서 만드는 모든 클래스는 Object 클래스를 상속받는다.
	// 우리가 만든 Animal 클래스는 다음과 기능적으로 완전히 동일하다
	// 굳이 아래 코드처럼 Object 클래스를 상속하도록 코딩하지 않아도 자바에서 만들어지는 
	// 모든 클래스는 Object 클래스를 자동으로 상속받게끔 되어 있다
	
	class HouseDog extends Dog {
		void sleep(int hour) {
	       //System.out.println(this.name + " zzz in house");
			// System.out.println(this.name+" zzz in house for " + hour + " hours");
			 // 이미 sleep이라는 메소드가 있지만 동일한 이름의 sleep메소드를 또 생성할 수 있다. 
			 // 단, 메소드의 입력항목이 다를 경우만 가능하다
			 // 새로 만든 sleep메소드는 입력항목으로 hour라는 int 자료형이 추가되었다.
			 // 이렇게 입력항목이 다른 경우 동일한 이름의 메소드를 만들 수 있는데 이를 메소드 오버로딩이라 한다.
			System.out.println(this.name + " zzz in house for " + hour + " hours");
	}
	
	public static void main(String[] args) {
		// Object animal = new Animal();
		// Object dog = new Dog();
		
		HouseDog houseDog = new HouseDog();
        houseDog.setName("happy"); 
        houseDog.sleep();  
        houseDog.sleep(3); 
	}

}
