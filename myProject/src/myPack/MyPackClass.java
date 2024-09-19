package myPack;

// java.lang 패키지는 따로 import하지 않아도 사용 가능
// java.lang.Object 클래스는 모든 자바 클래스의 최상위 클래스: 모든 클래스는 자동으로 Object 클래스를 상속받게 됨

public class MyPackClass {
	public static void main(String[] args) {
		
		// java.lang.String 클래스
		String str1 = "str";
		String str2 = "str";
		String str3 = new String("str");
		String str4 = new String("str");
		
		if (str1 == str2) System.out.println("주소 같음");
		else System.out.println("주소 다름");
		if (str3 == str4) System.out.println("주소 같음");
		else System.out.println("주소 다름");
		if (str1.equals(str2)) System.out.println("내용 같음");
		else System.out.println("내용 다름");
		if (str3.equals(str4)) System.out.println("내용 같음");
		else System.out.println("내용 다름");
		
		System.out.println("---\n---");
		
		boolean bool1 = false;
		String str5 = String.valueOf(bool1);
		System.out.println(str5);
		char[] charArr = {'a', 'b', 'c', 'd', 'e'};
		String str6 = String.valueOf(charArr);
		System.out.println(str6);
		Object object = MyPackClass.class;
		String str7 = String.valueOf(object);
		System.out.println(str7);
		
		System.out.println("---\n---");
		
		String hello2 = "   Hello, world!  ";
		System.out.println(hello2.trim());
		
		System.out.println("---\n---");
		
		String hello = "Hello, world!";
		System.out.println(hello.charAt(5));
		System.out.println(hello.substring(0, 6));
		System.out.println(hello.substring(7));
		System.out.println(hello.substring(7, hello.length()-1));
		
		System.out.println("---\n---");
		
		//
		String hello3 = hello.replace("a", "");
		hello3 = hello3.replace("e", "");
		hello3 = hello3.replace("i", "");
		hello3 = hello3.replace("o", "");
		hello3 = hello3.replace("u", "");
		System.out.println(hello.length() - hello3.length());
		
		System.out.println("---\n---");
		
		System.out.println( myExtract("Java", 2));
	}
	
	public static char myExtract(String str, int index) {
		return str.charAt(index);
	}
}
