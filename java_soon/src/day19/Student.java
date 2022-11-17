package day19;

public class Student {

	private int grade;
	private int classNum;
	private int num;
	private int name;
	private int Kor,Eng, Math;
	
	
	public Student(int grade, int classNum, int num, int name, int kor, int eng, int math) {
		
		this.grade = grade;
		this.classNum = classNum;
		this.num = num;
		this.name = name;
		this.Kor = kor;
		this.Eng = eng;
		this.Math = math;
	}


	public int getGrade() {
		return grade;
	}


	public void setGrade(int grade) {
		this.grade = grade;
	}


	public int getClassNum() {
		return classNum;
	}


	public void setClassNum(int classeNum) {
		this.classNum = classeNum;
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public int getName() {
		return name;
	}


	public void setName(int name) {
		this.name = name;
	}


	public Student(int grade, int classeNum, int num, String string, int kor, int eng, int math) {

		this.grade = grade;
		this.classNum = classeNum;
		this.num = num;
		this.name = name;
		this.Kor = kor;
		this.Eng = eng;
		this.Math = math;
	}


	public int getKor() {
		return Kor;
	}


	public void setKor(int kor) {
		Kor = kor;
	}


	public int getEng() {
		return Eng;
	}


	public void setEng(int eng) {
		Eng = eng;
	}


	public int getMath() {
		return Math;
	}


	public void setMath(int math) {
		Math = math;
	}
		
		

	

	
		
		
		
	

}
