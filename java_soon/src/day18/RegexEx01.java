package day18;

import java.util.Scanner;

public class RegexEx01 {

	public static void main(String[] args) {
		String regex = "^...$";
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		boolean res = java.util.regex.Pattern.matches(regex, str);
		if(res)
			System.out.println(str + "는 3글자로 되어있습니다");
		else
			System.out.println(str + "는 3글자가 아닙니다");
		

	}

}
