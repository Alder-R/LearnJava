package myPack;

public class MyPackClass {
	public static void main(String[] args) {
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
		
		String hello = "Hello, world!";
		System.out.println(hello.charAt(5));
		System.out.println(hello.substring(0, 6));
		System.out.println(hello.substring(7));
		
		System.out.println("---\n---");
		
		String hello2 = "   Hello, world!  ";
		System.out.println(hello2.trim());
	}
}
