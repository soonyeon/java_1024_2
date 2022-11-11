package day15;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class WordListMain2 {

	public static void main(String[] args) {
		/* 영어 단어장 프로그램을 구현하세요
		 * 메뉴
		 * 1. 단어 추가
		 * 2. 단어 확인
		 * 3. 단어 수정
		 * 4. 단어 삭제
		 * 5. 종료
		 * 메뉴선택 : 1
		 * 단어 : apple [한단어, 공백 입력 안함]
		 * 뜻 : 사가 [한 문장]
		 * 메뉴
		 * 1. 단어 추가
		 * 2. 단어 확인
		 * 3. 단어 수정
		 * 4. 단어 삭제
		 * 5. 종료
		 * 메뉴 선택 : 2
		 * 단어 입력 : apple
		 * 뜻 : 사가
		 * 1. 단어 추가
		 * 2. 단어 확인
		 * 3. 단어 수정
		 * 4. 단어 삭제
		 * 5. 종료
		 * 메뉴 선택 : 3
		 * 단어 입력 : apple
		 * 1. apple : 사가
		 * 수정할 번호 : 1
		 * 뜻 : 사과
		 * 수정이 완료됐습니다
		 * 메뉴
		 * 1. 단어 추가
		 * 2. 단어 확인
		 * 3. 단어 수정
		 * 4. 단어 삭제
		 * 5. 종료
		 * 메뉴 선택 : 4
		 * apple : 사과
		 * 삭제할 번호: 1
		 * 삭제가 완료됐습니다
		 * 메뉴
		 * 1. 단어 추가
		 * 2. 단어 확인
		 * 3. 단어 수정
		 * 4. 단어 삭제
		 * 5. 종료
		 * 메뉴 선택 : 5
		 * 프로그램 종료
		 * 
		 */

		ArrayList<Word> wordList = new ArrayList<Word>();
		int menu = -1;
		Scanner scan = new Scanner(System.in);
		
		do {
			//메뉴출력
			printMenu();
			try {
			
				//메뉴선택
				menu = scan.nextInt();
				
				//선택 메뉴 실행
				runMenu(menu,wordList);
			}catch(InputMismatchException e) {
				System.out.println("------------");
				System.out.println("예외 발생 : 정수를 입력하세요");
				System.out.println("------------");
			}
			catch(Exception e) {
				System.out.println("------------");
				System.out.println(e.getMessage());
				System.out.println("------------");
			}
		}while(menu != 5);	
	
	}

	private static void runMenu(int menu, ArrayList<Word> wordList) throws Exception {
		Scanner scan = new Scanner(System.in);
		switch(menu) {
		case 1:
			insertWord(wordList);
			break;
			
		case 2:
			printWord(wordList);
			break;
		case 3:
			updateWord(wordList);
			
			break;
		case 4:
			deleteWord(wordList);
//			// 단어 확인
//			printWordList(wordList);
//			// 삭제할 단어 번호 입력
//			System.out.println("삭제할 단어의 번호 입력");
//			int index = scan.nextInt()-1;
//			if(index < 0 || index >= wordList.size()) {
//				throw new Exception("예외발생 : 삭제할 번호가 잘못되었습니다");
//			}
//			// 입력한 번호에 맞는 단어 삭제
//			wordList.remove(index);
//			System.out.println("삭제가 완료되었습니다");
			break;
		case 5:
			System.out.println("----------");
			System.out.println("프로그램 종료");
			System.out.println("----------");
			break;
		default:
			throw new Exception("예외발생 : 잘못된 메뉴를 선택했습니");
		
		}
		
	}




	private static void printWord(ArrayList<Word> wordList) {
		if(wordList == null || wordList.size() == 0) {
			System.out.println("----------------");
			System.out.println("단어장이 비었습니다");
			System.out.println("----------------");
			return;
			}
		
			System.out.println("----------------");
			for(Word tmp :wordList) {
				System.out.println(tmp);
			}
			System.out.println("----------------");
	}
		
	

	private static void updateWord(ArrayList<Word> wordList)throws Exception{
		Scanner scan = new Scanner(System.in);
		//단어입력
		System.out.println("단어입력 : ");
		String word = scan.next();
		//단어장에서 입력 단어와 일치하는 단어 객체들을 가져옴(???)
		//실제 단어번지 : 1, 2, 4
		//0번지 : 1, 1번지에 : 2, 2번지 : 4
		ArrayList<Integer> indexList = findWordList(wordList,word);
		
		
		
		//가져온 단어 객체들을 출력
		//가져온 단어 객체들을 출력
		if(indexList == null || indexList.size() == 0) {
			throw new Exception("예외 발생 : 수정하려는 단어가 단어장에 없습니다");
		}
		for(int i = 0; i<indexList.size(); i++) {
			int index = indexList.get(i);
			System.out.println(i+1+". "+wordList.get(index));
		}
		
		//수정할 단어 번호를 입력 : 3번 입력 => 4번지 객체
		System.out.println("수정할 번호 : ");
		int index = scan.nextInt() -1;
		
		if(index < 0 || index >= indexList.size()) {
			throw new Exception("예외발생 : 수정할 번호를 잘못 선택했습니다. ");
		}
		
		// 수정할 뜻 입력
		System.out.println("뜻");
		scan.nextLine();
		String mean = scan.nextLine();
		//선택된 단어의 뜻을 수정
		Word tmp = wordList.get(indexList.get(index));
		tmp.setMean(mean);
	}
	
	

	private static ArrayList<Integer> findWordList(ArrayList<Word> wordList, String word) {
		ArrayList<Integer>list = new ArrayList<Integer>();
		for(int i = 0; i<wordList.size(); i++) {
			if(wordList.get(i).equals(word)) {
			list.add(i);
			}
		}
		return list;
	}

	

	private static void deleteWord(ArrayList<Word> wordList)throws Exception{
		Scanner scan = new Scanner(System.in);
		//단어 입력
		System.out.println("단어 입력 : ");
		String word = scan.next();
		ArrayList<Integer> indexList = findWordList(wordList, word);
		
		if(indexList == null || indexList.size() == 0) {
			throw new Exception("예외 발생 : 삭제하려는 단어가 단어장에 없습니다");
		}
		for(int i = 0; i<indexList.size(); i++) {
			int index = indexList.get(i);
			System.out.println(i+1+". "+wordList.get(index));
		}
		System.out.println("삭제할 번호 : ");
		int index = scan.nextInt() -1;
		
		if(index < 0 || index >= indexList.size()) {
			throw new Exception("예외발생 : 삭제할 번호를 잘못 선택했습니다. ");
		}
		wordList.remove((int)indexList.get(index));
		System.out.println("삭제가 완료됐습니다");
	}



	private static void addword(ArrayList<Word> wordList) {
		Scanner scan = new Scanner(System.in);
		//단어 입력
		System.out.println("단어 입력 : ");
		String word = scan.next();
		scan.nextLine(); // 위에서 입력한 엔터를 처리
		// 뜻 입력
		System.out.println("뜻 입력 : ");
		String mean = scan.nextLine();
		
		//단어 객체
		Word tmp = new Word(word, mean);
		
		//리스트에 단어 객체를 추가
		wordList.add(tmp);
		
		
	}

	private static void insertWord(ArrayList<Word> wordList) {
		Scanner scan = new Scanner(System.in);
		//단어 입력
		System.out.println("단어 입력 : ");
		String word = scan.next();
		scan.nextLine();//위에서 입력한 엔터를 처리
		//뜻 입력
		System.out.println("뜻 입력 : ");
		String mean = scan.nextLine();
		//단어 객체
		Word tmp = new Word(word,mean);
		//리스트에 단어 객체를 추가
		wordList.add(tmp);
		
		
	}
	
	
	private static void printMenu() {
		System.out.println("------메뉴-----");
		System.out.println("1. 단어 추가");
		System.out.println("2. 단어 확인");
		System.out.println("3. 단어 수정");
		System.out.println("4. 단어 삭제");	
		System.out.println("5. 종료");		
		System.out.print("메뉴 선택 : ");
		
	}

}
