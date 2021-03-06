package day11;

public class RegexPractice {

	public static void main(String[] args) {

		// パスワードの数値をマスク 1文字を1文字の*に
		String s1 = "abcd1234";
		String s1Regex = "TODO";
		System.out.println(s1.replaceAll(s1Regex, "*"));
		// abcd****

		// パスワードの数値をマスク 連続する数字は1文字の*に
		String s2Regex = "TODO";
		System.out.println(s1.replaceAll(s2Regex, "*"));
		// abcd*

		// パスワードの@#.?+以外を全てマスク
		String s3 = "a@b#c.d?1+2_";
		String s3Regex = "TODO";
		System.out.println(s3.replaceAll(s3Regex, "*"));
		// *@*#*.*?*+*_

		// 暗証番号数値4桁チェック 数値4桁以外はfalase
		String s4_1 = "9999";
		String s4_2 = "999";
		String s4_3 = "a92A";
		String s4Regex = "[0-9]{4}";
		System.out.println(s4_1.matches(s4Regex));// true
		System.out.println(s4_2.matches(s4Regex));// false
		System.out.println(s4_3.matches(s4Regex));// false

		// 郵便番号チェック
		String s5_1 = "999-9999";
		String s5_2 = "99-99999";
		String s5_3 = "9999999";
		String s5Regex = "TODO";
		System.out.println(s5_1.matches(s5Regex));// true
		System.out.println(s5_2.matches(s5Regex));// false
		System.out.println(s5_3.matches(s5Regex));// false

		// 一文の文章がまたは？で文章が終わっているか
		String s6_1 = "I love you.";
		String s6_2 = "Do you like cat?";
		String s6_3 = "Do you like cat";
		String s6Regex = "TODO";
		System.out.println(s6_1.matches(s6_1));// true
		System.out.println(s6_2.matches(s6_2));// false
		System.out.println(s6_3.matches(s5Regex));// false

		// URL部分のみを切り出す
		String s7_1 = "https://www.google.com/";
		String s7_2 = "http://www.google.com/";
		String s7Regex = "TODO";
		System.out.println(s7_1.replaceAll(s7Regex, ""));//www.google.com/
		System.out.println(s7_2.replaceAll(s7Regex, ""));//www.google.com/

	}

}
