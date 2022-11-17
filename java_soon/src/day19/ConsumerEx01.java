package day19;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ConsumerEx01 {

	public static void main(String[] args) {
		ArrayList<Student2> list = new ArrayList<Student2>();
		list.add(new Student2(1,1,1,"홍길동"));
		list.add(new Student2(1,2,1,"임꺽정"));
		list.add(new Student2(1,1,2,"고길동"));
	
		print(list, (a) -> System.out.println(a));
		
		print(list, (a) ->{
			System.out.println("학년 : "+ a.getGrade());
			System.out.println("반 : "+ a.getClassNum());
			System.out.println("번호 : "+ a.getNum());
			System.out.println("이름 : "+ a.getName());
			System.out.println("---------------------");
		});
	
	}
	public static <Student2> void print(ArrayList<Student2> list,Consumer<Student2>con) {
		for(Student2 tmp : list) {
			con.accept(tmp);
		}
	}
}
