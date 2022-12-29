package example.db.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import db.day4.vo.StudentVO;
import example.db.dao.StudentDAO;




public class MainController {

	private SqlSession session;
	private StudentDAO studentDao;
	private Scanner scan = new Scanner(System.in);
	
	public MainController(SqlSession session) {
		this.session = session;
		studentDao = session.getMapper(StudentDAO.class);
	}
		
		
	public void run() {
		/* 학생추가
		 * 학생 수정
		 * 학생 조회
		 * 프로그램 종료
		 */
		int menu = -1;
		int exit = 4;
		
		do {
			try {
				
				printMenu();
				menu = scan.nextInt();
				scan.nextLine();
				runMenu(menu);
				
			} catch (InputMismatchException e) {
				System.out.println("잘못된 타입 입력");
				scan.nextLine();
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			
		}while(menu != exit);
		System.out.println("프로그램 종료");
		
		
	}

	private void runMenu(int menu) {
		switch (menu) {
		case 1:
			insertStudent();
			break;
		case 2:
			updateStudent();
			break;
		case 3:
			selectStudent();
			break;
		case 4:
			break;
		default: System.out.println("잘못된 메뉴");
		}
		
	}
	
	private void updateStudent() {
		
	
		
	}
	
	private void selectStudent() {
		
	
		
	}
	
	private void insertStudent() {
		System.out.println("학생 정보 입력");
		System.out.println("학번 : ");
		String st_num = scan.nextLine();
		System.out.println("이름 : ");
		String st_name = scan.nextLine();
		System.out.println("학기 :");
		int st_semester = scan.nextInt();
		System.out.println("상태 :");
		String st_state = scan.nextLine();
		System.out.println("지도교수 :");
		String st_pr_num = scan.nextLine();
		StudentVO std = new StudentVO( st_num, st_name, st_semester, st_state, st_pr_num);
		
		if(studentDao.insertStudent(std) != 0) {
			System.out.println("학생 추가 성공");
			session.commit();
		}else {
			System.out.println("학생추가 실패");
		}
		
	}

	private void printMenu() {
		System.out.println("-----<menu>-----"); 
		System.out.println("1. 학생 추가"); 
		System.out.println("2. 학생 수정"); 
		System.out.println("3. 학생 조회");
		System.out.println("4. 종료"); 
		System.out.println("메뉴 선택 : "); 
		
	}

}
