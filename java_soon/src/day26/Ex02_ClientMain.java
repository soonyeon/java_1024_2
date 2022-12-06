package day26;

import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;


public class Ex02_ClientMain {

	public static void main(String[] args) {
		/* 서버에 연결을 요청하고연결이 되면 exit를 입력하기 전까지
		 * 문자열을 서버에 전송
		 */
		
		
		Socket socket = null;
		
		
		try {
		
			socket = new Socket();
			socket.connect(new InetSocketAddress(5001));
			System.out.println("[연결 완료]");
			send(socket);
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}

	public static void send(Socket socket) {
		Scanner scan = new Scanner(System.in);
		try {
			OutputStream os = socket.getOutputStream();
			while(true){
				System.out.println("전송할 문자열 : ");
				String str = scan.nextLine();
				if(str.equals("exit"))
					break;
				byte[] bytes = str. getBytes("UTF-8");
				os.write(bytes);
				os.flush();
			}
			os.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
