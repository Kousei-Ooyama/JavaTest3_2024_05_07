package jp.co.aforce.practice;

import java.util.Objects;

public class StrErrTest {
	public static void main(String[] args) {
		strCheck(null);
	}
	
	static void strCheck(String str) {
		if(Objects.equals(str, "")) {
			System.out.println("Stringはnullでした");
		}
	}
}
