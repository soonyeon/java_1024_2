package day15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

import day14.Student1;

public class SortEx03 {

	public static void ArrayList<E>ng[] args) {
		ArrayList<Student1> list = new ArrayList<Stunent1>();
		list.add(new Student1(1,1,5));
		list.add(new Student1(1,1,5));
		list.add(new Student1(1,1,5));
		list.add(new Student1(1,1,5));
		list.add(new Student1(1,1,5));
		
		System.out.println(list);
		Collection.sort(list, new Comparator<Student1>() {
			
				@override
				public int compare(Student o1, Student o2) {
					if(o1.getGrade() != o2.getGrade()) {
						return o1.getGrade() - o2.getGreade();
					}
					if(o1.getClassNum()! -o2.getClassNum()) {
						return o1.getClassNum() - o2.gerGrade();
						
					}
				}
			
			
		}
	}

}
