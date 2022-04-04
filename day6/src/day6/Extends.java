package day6;

public class Extends {

	class Animal {
	    String name;
	    
	    
	    void setName(String name) {
	        this.name = name;
	    }
	    class Dog extends Animal {
	     void sleep() {
	    	 System.out.println(this.name+" zzz");
	    	// Dog 클래스는 Animal 클래스보다 좀 더 많은 기능
	    	// 이렇듯 보통 부모 클래스를 상속받은 자식 클래스는 부모 클래스의 기능에 더하여 좀 더 많은 기능을 갖도록 작성
	    }
	     
	     
	     // 클래스 상속을 위해서는 extends 라는 키워드를 사용
	     // Dog 클래스는 Animal 클래스를 상속하게 되었다
	     // Dog 클래스에 name 이라는 객체변수와 setName 이라는 메소드를 만들지 않았지만 Animal 클래스를 상속했기 때문에 그대로 사용이 가능
	    
	     
	     // Dog 클래스는 Animal 클래스를 상속했다
	     // 즉, Dog는 Animal의 하위 개념이라고 할 수 있다.
	     //	이런 경우 Dog는 Animal에 포함되기 때문에 "개는 동물이다"라고 표현할 수 있다.
	public static void main(String[] args) {
	     Dog dog = new Dog();
	        dog.setName("poppy");
	        System.out.println(dog.name);  // poppy 출력
	        
	        // Dog dog = new Animal();
	        // 부모 클래스로 만들어진 객체를 자식 클래스의 자료형으로는 사용할 수 없다.
			}
	    }
	}
}	