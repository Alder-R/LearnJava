package myCondition;

public class SwitchExam {

	public static void main(String[] args) {
		
		int a= 16, b = 10;
		char op = '*';
		
		switch (op) {
		case '+': System.out.println(a+" + "+b+" = "+(a+b)); break;
		case '-': System.out.println(a+" - "+b+" = "+(a-b)); break;
		case '*': System.out.println(a+" * "+b+" = "+(a*b)); break;
		case '/': System.out.println(a+" / "+b+" = "+(a/b)); break;
		default:  System.out.println("사칙연산자가 아닙니다.");		 break;
		}	// break문이 없으면 case '*'부터 끝까지 실행한다.
		
		switch (a%3) {
		case 0: System.out.println(a+"은(는) 3의 배수이다"); 		break;
		case 1:
		case 2: System.out.println(a+"은(는) 3의 배수가 아니다"); 	break;
		}	// case 1에 break가 없으므로 case 2의 코드 실행
				
	}

}
