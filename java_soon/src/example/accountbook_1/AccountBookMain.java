package example.accountbook_1;

import java.util.Scanner;

public class AccountBookMain {

	public static void main(String[] args) {
		AccountBook ab = new AccountBook(new Scanner(System.in));
		ab.run();

	}

}
