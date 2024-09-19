package myPack;

public class MyStringBuffer {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("Java Programming");
		System.out.println(sb1.append(" ASDF"));
		System.out.println(sb1.append(false));
		System.out.println(sb1.append(3.14f));
		
		StringBuffer sb2 = new StringBuffer("Java Programming");
		System.out.println(sb2.replace(0, 4, "JAVA"));
		System.out.println(sb2.replace(0, 4, "Python"));
		System.out.println(sb2.replace(0, 6, "C#"));
		
		StringBuffer sb3 = new StringBuffer("Hello, world!");
		System.out.println(sb3.reverse());
	}

}
