package day24;

import java.io.Serializable;

import lombok.Data;

@Data
public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	private int grade, classNum, num;
	
	
	public Student(String name, int grade, int classNum, int num) {
		this.name = name;
		this.grade = grade;
		this.classNum = classNum;
		this.num = num;
	
	}

	@Override
	public String toString() {
		return "학생정보 [이름 : " + name + ", 학년 : " + grade + ", 반 : " + classNum + ", 번호 : " + num + "] " ;
	}

	
	
}
