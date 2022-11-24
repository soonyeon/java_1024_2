package day16;

import lombok.Data;

@Data
public class UserImfor {

	private String id;
	private String pw;
	private	String name;
	private int age;
	private String personalNum;
	
	
	public UserImfor(String id, String pw, String name, int age, String personalNum) {
			
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
		this.personalNum = personalNum;
	}


	@Override
	public String toString() {
		return "사용자 리스트 [ID :" + id + ", PW :" + pw + ", name :" + name + ", age :" + age + ", personalNum :" + personalNum
				+ "]";
	}
	
	
	
	

	
	

	

}
