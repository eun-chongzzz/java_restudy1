package day3;

public class Question {

	public static void main(String[] args) {
		// while문 또는 for 문을 사용하여 다음과 같이 별(*)을 표시하는 프로그램을 작성해 보자.
		/*
			*
			**
			***
			****
			*****
		*/
		int a=0;
		while(true) {
			a += 1;
			if(a>5) {
				break;
			}
			for (int b=0; b<a; b++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		
		// for문을 사용해 1부터 100까지의 숫자를 출력해보자
		for(int i=1; i<=100; i++) {
			System.out.println(i);
		}
		
		
		
		
		// A 학급에 총 10명의 학생이 있다. 이 학생들의 중간고사 점수는 다음과 같다
		int[] marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
		// for each 문을 사용하여 A 학급의 평균점수를 구해보자.
		
		int total = 0;
		for(int d : marks) {
			total += d;
		}
		double avg = (total / marks.length);
		System.out.println(avg);
	}

}
