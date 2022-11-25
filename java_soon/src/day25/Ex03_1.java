package day25;

import java.util.ArrayList;
import java.util.Random;

public class Ex03_1 {

	// 1에서 9사이의 숫자를 랜덤하게 9번 뽑아서 일렬로 출력하는 코드를 작성하세요
	public static void main(String[] args) {
		//list에 1~9까지 모두 저장
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		ArrayList<Integer> res = new ArrayList<Integer>();
		int min = 1, max = 9;
		
		//list에 1~ 9까지 숫자를 모두 저장
		for(int i = min; i <= max; i++)
			list.add(i);
		
		//랜덤으로 선턱해서 res에저장
		while(list.size() != 0) { //list가 비워질때까지
			int r= random(0, list.size()-1);//랜덤으로 숫자(r)를 생성해서
			int num = list.remove(r); //res에 저장하고 리스트에서 지움 
			res.add(num);
		}
		System.out.println(res);
	}
	public static int random(int min, int max) {
		if(max < min) {
			int tmp = max;
			max = min;
			min = tmp;
		}
		Random r = new Random();
		//nextInt(정수) : 0이상 정수미만의 랜덤한 정수를 알려줌
		return r.nextInt(max - min +1) + min;
	}
	
	
	

}
