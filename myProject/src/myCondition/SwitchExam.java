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
		default:  System.out.println("��Ģ�����ڰ� �ƴմϴ�.");		 break;
		}	// break���� ������ case '*'���� ������ �����Ѵ�.
		
		switch (a%3) {
		case 0: System.out.println(a+"��(��) 3�� ����̴�"); 		break;
		case 1:
		case 2: System.out.println(a+"��(��) 3�� ����� �ƴϴ�"); 	break;
		}	// case 1�� break�� �����Ƿ� case 2�� �ڵ� ����
				
	}

}
