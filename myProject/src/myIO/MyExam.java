package myIO;

import java.io.*;

public class MyExam {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			StringBuffer a = new StringBuffer(br.readLine());
			System.out.println("문자열 길이: " + a.length());
			System.out.println("역순: " + a.reverse());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
