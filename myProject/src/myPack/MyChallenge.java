package myPack;

import java.util.Scanner;

public class MyChallenge {

	public static void main(String[] args) {
		
		System.out.print("문자열을 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringBuffer sb = new StringBuffer(str);
		
		System.out.print("숫자를 입력하세요 (예: 10, 20, 30): ");
		String str2 = sc.nextLine();
		
		System.out.println("문자열의 길이: " + str.length());
		String strTemp = str.replaceAll("[A-Z]" , "");
		System.out.println("대문자 개수: " + (str.length() - strTemp.length()));
		strTemp = str.replaceAll("[a-z]" , "");
		System.out.println("소문자 개수: " + (str.length() - strTemp.length()));
		strTemp = str.replaceAll("[0-9]" , "");
		System.out.println("숫자 개수: " + (str.length() - strTemp.length()));
		strTemp = str.replaceAll("[ ]" , "");
		System.out.println("공백 개수: " + (str.length() - strTemp.length()));
		System.out.println("역순 문자열: " + sb.reverse());
		
		String[] arr1 = str2.split(" ");
		Integer[] in1 = new Integer[arr1.length];
		int sum = 0;
		double aver = 0;
		for (int i = 0; i < arr1.length; i++) {
			in1[i] = Integer.parseInt(arr1[i]);
			sum += in1[i];
			aver += in1[i];
		}
		aver /= arr1.length;
		System.out.println("숫자의 합계: " + sum);
		System.out.println("숫자의 평균: " + aver);
	}

}
