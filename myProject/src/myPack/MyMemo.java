package myPack;

import java.io.*;
import java.util.Scanner;

public class MyMemo {

	public static void main(String[] args) throws IOException {
		byte[] b = new byte[1024];
		StringBuffer sb = new StringBuffer("");
		String str = "";
		FileOutputStream memo = new FileOutputStream("memo.txt");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("종료 및 저장하려면 '종료' 입력, 메모를 확인하려면 '보기' 입력");
		
		while (!str.equals("종료")) {
			System.out.print("메모를 입력하세요: ");
			str = sc.nextLine();
			if (str.equals("보기")) {
				System.out.println("\n저장된 메모:\n" + sb);
			}
			else {
				sb.insert(sb.length(), (str + "\n"));
			}
		}
		
		System.out.println("프로그램을 종료합니다.");
		
		b = sb.substring(0, sb.length() - 4).toString().getBytes();
		
		memo.write(b);
		memo.close();
	}

}
