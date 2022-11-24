package day24;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentMain {

	/*학생 정보를 관리하는 프로그램을 작성하세요
	 * 1. 학생 추가
	 * 2. 학생 출력
	 * 3. 종료
	 * - 프로그램 시작 전 학생 정보를 읽어오는 기능 추가(load)
	 * - 프로그램 종료 전 학생 정보를 저장하는 기능 추가(save)
	 * 
	 */
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		String fileName = "Student.txt";
		int menu = -1;
		ArrayList<Student>list = new ArrayList<Student>();
		load(list,fileName);
		//load(list);
		do {
			//메뉴 출력
			printMenu();
			//메뉴 선택
			menu = scan.nextInt();
			printBar();
			//선택 메뉴 실행
			runMenu(menu,list);
		}while(menu != 3);
		//save(list);
		save(list,fileName);
	}

	private static void runMenu(int menu, ArrayList<Student> list) {
		switch (menu) {
		case 1:
			//학생 추가
				//콘솔에 입력받아 객체 생성
			
		
			Student tmp = addStudent();
			//System.out.println(tmp);
			list.add(tmp);
			System.out.println("학생 정보 등록 완료");
			
			break;
		case 2:
			//학생 출력
			System.out.println(list);
			break;
		case 3:
			System.out.println("프로그램 종료");
			break;
		default:
			System.out.println("잘못된 입력입니다");
		}
		
	}

	private static Student addStudent() {
		scan.nextLine();
		System.out.println("이름 : ");
		String name = scan.nextLine();
		System.out.println("학년 : ");
		int grade = scan.nextInt();
		System.out.println("반 :");
		int classNum = scan.nextInt();
		System.out.println("번호 : ");
		int num = scan.nextInt();
		return new Student(name, grade, classNum, num);
		
	}
	
	private static void addStudent2(ArrayList<Student> list) {
		if(list == null)
			throw new RuntimeException("학생을 관리할 리스트가 생성되지 않았습니다");
		
		System.out.println("이름 : ");
		String name = scan.next();
		System.out.println("학년 : ");
		int grade = scan.nextInt();
		System.out.println("반 :");
		int classNum = scan.nextInt();
		System.out.println("번호 : ");
		int num = scan.nextInt();
		//입력받은 학생 정보를 이용하여 학생 객체 생성
		Student std = new Student(name, grade, classNum, num);
		//추가
		list.add(std);
		printStr("학생추가 완료");
		System.out.println(list);
		
	}
	
	private static void printStudent(ArrayList<Student> list) {
		if(list == null)
			throw new RuntimeException("예외발생 : 학생을 관리할 리스트가 없습니다");
		if(list.size() == 0) {
			printStr("학생 정보가 없습니다");
			return;
		}
		for(Student std : list) {
			System.out.println(std);
		}
		printBar();
	}

	private static void printMenu() {
		System.out.println("======메 뉴====== ");
		System.out.println("1. 학생 추가");
		System.out.println("2. 학생 출력");
		System.out.println("3. 종료");
		printBar();
		System.out.println("메뉴 선택 : ");
		
	}
	
	private static void printStr(String str) {
		System.out.println(str);
		printBar();
	}
	
	private static void printBar() {
		
		System.out.println("================");
	}
	
	private static void save(ArrayList<Student> list, String fileName) {
		if(list == null)
			throw new RuntimeException("예외발생 : 학생을 관리할 리스트가 생성되지 않았습니다");
		
		try (ObjectOutputStream oos
				= new ObjectOutputStream(new FileOutputStream(fileName))) {
			
			for(Student std : list) {
				oos.writeObject(std);
			}
			printStr("저장했습니다");
			
		}catch(FileNotFoundException e) {
			printStr(fileName +"을 생성할 수 없어서 저장에 실패했습니다");
			
		}catch(IOException e) {
			printStr("저장 실패");
		
		}
	}
		
	private static void load(ArrayList<Student> list, String fileName) {
		if(list == null) 
			throw new RuntimeException("예외발생 : 학생을 관리할 리스트가 생성되지 않았습니다");
			
		try (ObjectInputStream ois
			= new ObjectInputStream(new FileInputStream(fileName))) {
			while(true) {
				Student std = (Student) ois.readObject();
				list.add(std);
			}
		}catch(FileNotFoundException e) {
			printStr(fileName +"이 없어서 불러오기에 실패했습니다");
		}catch(EOFException e) {
			printStr("불러오기 완료");
		}catch(Exception e) {
			printStr("불러오기 실패");
			
		}
	}
}
