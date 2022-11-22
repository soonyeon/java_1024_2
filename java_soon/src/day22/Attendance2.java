package day22;

import lombok.Data;

@Data
public class Attendance2 {


	private String name, birth;
	
	public Attendance2(String name, String birth) {
		super();
		this.name = name;
		this.birth = birth;
	}

	@Override
	public String toString() {
		return "학생 정보 [이름 : " + name + ", 생년월일 : " + birth + "]";
	}
	

}
