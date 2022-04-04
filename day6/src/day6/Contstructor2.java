package day6;

public class Contstructor2 {
	
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

	    HouseDog(int type) {
	        if (type == 1) {
	            this.setName("yorkshire");
	        } else if (type == 2) {
	            this.setName("bulldog");
	        }
	    }

	    void sleep() {
	        System.out.println(this.name + " zzz in house");
	    }

	    void sleep(int hour) {
	        System.out.println(this.name + " zzz in house for " + hour + " hours");
	    }
	}
		// 위의 HouseDog 클래스는 두 개의 생성자가 있다.
		// 하나는 String 자료형을 입력으로 받는 생성자이고 다른 하나는 int 자료형을 입력으로 받는 생성자이다
		// 이렇게 입력 항목이 다른 생성자를 여러 개 만들 수 있는데 이런 것을 생성자 오버로딩이라고 한다
	public static void main(String[] args) {
		//HouseDog happy = new HouseDog("happy");
		//HouseDog yorkshire = new HouseDog(1);
        HouseDog happy = new HouseDog("happy");  // 문자열로 생성
        HouseDog yorkshire = new HouseDog(1);  // 숫자값으로 생성
        
        System.out.println(happy.name);  // happy 출력
        System.out.println(yorkshire.name);  // yorkshire 출력
	}

}
