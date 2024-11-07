package myIO;

import java.io.*;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) throws IOException {
		int num = 0, index = 0;
		String findStr = "", tempStr = "";
		Scanner sc = new Scanner(System.in);
		BufferedReader txt = new BufferedReader(new FileReader("./sample.txt"));

		System.out.print("검색할 글자 입력: ");
		findStr = sc.next().toLowerCase();
		
		while ((tempStr = txt.readLine()) != null) {
			tempStr = tempStr.toLowerCase();
			System.out.println(tempStr);
			index = tempStr.indexOf(findStr);
			while (index != -1) {
				num++;
				System.out.println(num);
				index = tempStr.indexOf(findStr, index + findStr.length());
			}
		}
		
		System.out.println();
		if (num != 0) {
			System.out.println(findStr + "이 파일 내 " + num + "개 있음");	
		}
		else {
			System.out.println(findStr + "이 파일 내 없음");
		}
		
	}

}
