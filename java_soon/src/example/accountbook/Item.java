package example.accountbook;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import lombok.Data;

@Data
public class Item {
	private String type, purpose, content;
	private int money;
	private Date date;
	
	public Item(String type, String purpose, String content, int money, String date) throws ParseException {
		super();
		this.type = type;
		this.purpose = purpose;
		this.content = content;
		this.money = money;
		setDate(date);
	}
	public void setDate (String date) throws ParseException {
		SimpleDateFormat format= new SimpleDateFormat("yyyy-MM-dd");
		this.date = format.parse(date);
	}
	public String getDateStr() {
		SimpleDateFormat format= new SimpleDateFormat("yyyy-MM-dd");
		return format.format(date);
	}
	public String getMoneyStr() {
		DecimalFormat df = new DecimalFormat("###,###");
		return df.format(money);
	}
	
	public void print() {
		System.out.println("==============");
		System.out.println("구분 : " + type);
		System.out.println("분류 : " + purpose);
		System.out.println("내용 : " + content);
		System.out.println("금액 : " + getMoneyStr() + "원");
		System.out.println("일시 : " + getDateStr());
		System.out.println("==============");
	}

	public String toString() {
		return type + " | " + getDateStr() + " | "+ purpose + " | "+ getMoneyStr()+"원  | "+ content;
	}
	
	public int inputYear(Scanner year);
		System.out.print("연도 입력 : ");
		int year= scan.nextInt();
		if(year < 0)
			throw new RuntimeException("예외발생 : 월을 잘못 입력했습니다");
		return year;
	

	public int inputMonth(Scanner month);
		System.out.print("월 입력 : ");
		int  month = scan. nextInt();
		if(month < 0)
			throw new RuntimeException("예외발생 : 월을 잘못 입력했습니다");
		return month; 
		
	public int inputDay(Scanner day));
		System.out.print("일 입력 : ");
		int day =  scan.nextInt();
		if(day < 0)
			throw new RuntimeException("예외발생 : 월을 잘못 입력했습니다");
		return day;

}
