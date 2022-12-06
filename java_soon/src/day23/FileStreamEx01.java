package day23;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamEx01 {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		FileInputStream fis = null;
		try {
			fos = new FileOutputStream("test.txt"); //테스트 txt에 출력(파일이 없으면 새로 만든다)
			char ch = '\u0000';
			for(int i = 0; i<200; i++) {
				//System.out.print(ch);
				fos.write(ch);
				++ch;
			}
			fis = new FileInputStream("test.txt"); //받는 (파일없으면 예외 filenotfound발생)
			int num;
			for(int i = 0; i<200; i++) {
				num = fis.read();
				System.out.print((char)num);
			}
		}catch(FileNotFoundException e) {
			System.out.println("파일을 찾지 못했습니다.");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fos.close(); //파일을 열었으면 닫아야 함
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
