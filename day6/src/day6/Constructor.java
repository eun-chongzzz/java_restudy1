package day6;

public class Constructor {
	
	class Animal {
	    String name;

	    void setName(String name) {
	        this.name = name;
	    }
	}
	
	class Dog extends Animal {
	    void sleep() {
	        System.out.println(this.name + " zzz");
	    }
	}
	
	class HouseDog extends Dog {
		  
		HouseDog(String name) {
		        this.setName(name);
		    }
		// 위 메소드처럼 메소드명이 클래스명과 동일하고 리턴 자료형을 정의하지 않는 메소드를 생성자라고 한다.
		
		// 생성자의 규칙
		// 클래스명과 메소드명이 동일하다.
		// 리턴타입을 정의하지 않는다. (void도 사용하지 않는다.)

			
	    void sleep() {
	        System.out.println(this.name + " zzz in house");
	    }
	    
	void sleep(int hour) {
	       System.out.println(this.name + " zzz in house for " + hour + " hours");
	    }
	}
	
	public static void main(String[] args) {
		 	HouseDog houseDog = new HouseDog("happy"); //// 생성자 호출 시 문자열을 전달해야 한다.
		 	// 이렇듯 생성자를 사용하면 setName("happy")와 같은 필수적인 행동을 객체 생성시에 제어할 수 있다.
		 	System.out.println(dog.name); // null 출력
	        // dog객체의 name 변수에 아무런 값도 설정하지 않았기 때문에 null이 출력될 것이다
		 	// 이렇듯 HouseDog 클래스는 코딩하기에 따라 객체변수 name에 값을 설정할 수도 있고 설정 안할 수도 있다
		 	// 그러면 name 이라는 객체변수에 값을 무조건 설정해야만 객체가 생성될 수 있도록 강제할 수 있는 방법은 없을까?
		 	// 생성자를 이용하면 된다.
	}

}
