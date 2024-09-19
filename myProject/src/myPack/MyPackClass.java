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
	}
}
