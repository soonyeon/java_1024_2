package day22;

import lombok.Data;

@Data
public class StudentLog {

	private Student std;
	private String state;
	
	public StudentLog(String name, String birthday, String state) {
		std = new Student(name, birthday);
		this.state = state;
		
	}

	public StudentLog(Student std2, Object object) {
		this.std = new Student(std);
		this.state = state;
	}


}
