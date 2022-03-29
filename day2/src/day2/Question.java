package day2;

public class Question {

	public static void main(String[] args) {
		// while문을 사용해 1부터 1000까지의 자연수 중 3의 배수의 합은?
		 	int result = 0;
	        int a = 1;
	        
	        while (a <= 1000) {
	            if (a % 3 == 0) {  
	                result += a;
	            }
	            a += 1;
	        }
	        System.out.println(result); 
	        
	}

}
