package day21;

import java.util.ArrayList;


import lombok.Data;

@Data
public class PhoneBook {
//클래스는 필드 메소드 생성자로 구성되어있다
	
	private String name, company;
	ArrayList<PhoneNumber>pnList;
	
	public PhoneBook(String name, String company, ArrayList<PhoneNumber> pnList) {
		this.name = name;
		this.company = company;
		this.pnList = pnList;
	}
	public void print() {
		System.out.println("=======");
		System.out.println("이름 : " +name);
		System.out.println("직장 : "+ company);
		for(PhoneNumber tmp : pnList)
			System.out.println(tmp);
		System.out.println("==========");
	}
}
