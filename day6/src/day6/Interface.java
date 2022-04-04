package day6;
	
// 인터페이스(Interface)는 초보 개발자를 괴롭히는 단골손님이다.
// 인터페이스에 대한 개념없이 코드로만 이해하려고 하면 곧 미궁에 빠지게 된다.
// 이렇게 이해하기 힘든 인터페이스는 도대체 왜 필요하게 된 걸까?
public class Interface {
	class Animal {
	    String name;

	    void setName(String name) {
	        this.name = name;
	    }
	}
	class Tiger extends Animal {
	}

	class Lion extends Animal {
	}
	class ZooKeeper {
	    void feed(Tiger tiger) {  // 호랑이가 오면 사과를 던져 준다
	        System.out.println("feed apple");
	    }
	    void feed(Lion lion) {  // 사자가 오면 바나나를 던져 준다.
	        System.out.println("feed banana");
	    }
	}
	// 이전 챕터에서 보았던 Dog 클래스와 마찬가지로 Animal을 상속한 Tiger와 Lion이 등장했다. 
	// ZooKeeper 클래스는 호랑이가 왔을 때, 사자가 왔을 때 각각 다른 feed 메소드가 호출된다.
	public static void main(String[] args) {
		 	ZooKeeper zooKeeper = new ZooKeeper();
	        Tiger tiger = new Tiger();
	        Lion lion = new Lion();
	        zooKeeper.feed(tiger);  // feed apple 출력
	        zooKeeper.feed(lion);  // feed banana 출력
	}

}
