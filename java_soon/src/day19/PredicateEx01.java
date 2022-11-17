package day19;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateEx01 {

	private static int printGrade;
	public static void main(String[] args) {
		ArrayList<Student>list = new ArrayList<Student>();
		list.add(new Student(1,1,1,"홍길동",100, 90, 80));
		list.add(new Student(1,2,1,"임꺽정",90, 90, 80));
		list.add(new Student(1,1,2,"고길동",10, 90, 20));
		/* 1학년 1반 학생들을 출력하는 코드를 작성하세요
		 * 1학년 2반 학생들을 출력하는 코드를 작성하세요
		 * 1학년 학생들을 출력하는 코드를 작성하세요
		 */
//		if(printGrade == 1) {
//			print(list,"1학년", s -> s.getName());
//			
//		}
//		
//		else {
//			
//		}
		
	//	print(list,1,1);
	//	print(list,1);
	//	print(list,(s) -> s.getGrade() ==1 && s.getClassNum == 1);
		print(list,(s) -> s.getGrade() ==1);
	//	print(list,(s) -> s.getName() == char('홍');
	}
	
	public static void printName(ArrayList<Student>list,int grade, int classNum) {
		for(Student tmp : list) {
			if(tmp.getGrade() == grade && tmp.getClassNum() == classNum)
				System.out.println(tmp);
			
		}
	}
	public static void printName(ArrayList<Student>list,int grade) {
		for(Student tmp : list) {
			if(tmp.getGrade() == grade)
				System.out.println(tmp);
			
		}
	}
	
	
	public static void print(ArrayList<Student>list, Predicate<Student> p) {
		for(Student tmp: list) {
			if(p.test(tmp)) {
				System.out.println(tmp);
			}
		}
	}
//	private static void print(ArrayList<Student> list, String string,Function<Student, Integer>g) {
//		for(Student tmp : list) {
//			System.out.println( g.apply(tmp));
//		}
//	}
//
//	public static void printName(ArrayList<Student>list) {
//		for(Student tmp : list) {
//			System.out.println("1학년 1반 학생 :"+ tmp + tmp.getName());
//			
//		}
//	}
//	public static void printGrade(ArrayList<Student>list) {
//		for(Student tmp : list) {
//			System.out.println("1학년 1반 학생 :"+ tmp + tmp.getGrade());
//			
//		}
//	}
//	public static void printClassNum(ArrayList<Student>list) {
//		for(Student tmp : list) {
//			System.out.println("1학년 1반 학생 :"+ tmp + tmp.getClasseNum());
//			
//		}
//	}

	
}
