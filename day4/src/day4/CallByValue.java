package day4;

	class Updater {
		void update(Counter counter) {
			counter.count++;
		}
	}
	
	class Counter{
		int count = 0; // 객체변수
	}

public class CallByValue {
	public static void main(String[] args) {
		// Call by value
		// 메소드에 값(primitive type)을 전달하는 것과 객체(reference type)를 전달하는 것에는 큰 차이가 있다 
		// 이것은 매우 중요하기 때문에 이전에 잠깐 언급했지만 다시한번 자세히 알아보자
		
		// 결론부터 얘기한다면 메소드에 객체를 전달할 경우 메소드에서 객체의 객체변수(속성) 값을 변경할 수 있다
		
		Counter myCounter = new Counter();
		System.out.println("before update:"+myCounter.count);
	    Updater myUpdater = new Updater();
	    myUpdater.update(myCounter);
	    System.out.println("after update:"+myCounter.count);
	    
	    // 이전 예제와의 차이점은 update 메소드의 입력항목이다
	    // int count와 같이 값을 전달받았다면 지금은 Counter counter와 같이 객체를 전달받도록 변경한 것이다
	    
	    // update 메소드를 호출하는 부분도 다음처럼 바뀌었다
	    // myUpdater.update(myCounter);
	    
	    // myCounter 객체의 count 값이 1만큼 증가되었다
	    
	    // 이렇게 메소드의 입력으로 객체를 전달받는 경우에는 메소드가 입력받은 객체를 그대로 사용하기 때문에
	    // 메소드가 객체의 속성값을 변경하면 메소드 수행 후에도 객체의 변경된 속성값이 유지된다
	}

}
