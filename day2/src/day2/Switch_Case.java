package day2;

public class Switch_Case {

	public static void main(String[] args) {
		// switch/case 문은 if 문과 비슷하지만 좀 더 정형화된 조건 판단문
		
		// switch/case 문의 구조
		
		/* switch(입력변수) {
	    case 입력값1: ...
	         break;
	    case 입력값2: ...
	         break;
	    ...
	    default: ...
	         break;
	} */
		
		// 입력변수의 값과 일치하는 case 입력값이(입력값1, 입력값2,.. )이 있다면 해당 case문에 속한 문장들이 실행
		// case문마다 break 라는 문장이 있는데 해당 case문을 실행한뒤 switch 문을 빠져나가기 위한것
		// 만약 break문이 빠져있다면 그 다음 case문이 실행된다
		
			int month = 8;
	        String monthString = "";
	        
	        switch (month) {
	            case 1:  monthString = "January";
	                     break;
	            case 2:  monthString = "February";
	                     break;
	            case 3:  monthString = "March";
	                     break;
	            case 4:  monthString = "April";
	                     break;
	            case 5:  monthString = "May";
	                     break;
	            case 6:  monthString = "June";
	                     break;
	            case 7:  monthString = "July";
	                     break;
	            case 8:  monthString = "August";
	                     break;
	            case 9:  monthString = "September";
	                     break;
	            case 10: monthString = "October";
	                     break;
	            case 11: monthString = "November";
	                     break;
	            case 12: monthString = "December";
	                     break;
	            default: monthString = "Invalid month";
	                     break;
	        }
	        System.out.println(monthString);
	    }
		
		//  month가 8로 고정되어 있기 때문에 "August"라는 문자열이 출력
	
	
	}


