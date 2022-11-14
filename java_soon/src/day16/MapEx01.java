package day16;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx01 {

	public static void main(String[] args) {
		HashMap<String, String> userList = new HashMap<String, String>();
		userList.put("idl", "pw1");
		userList.put("id2", "pw2");
		userList.put("id3", "pw2");
		
		/* map은 순서를 보장하지 않는다
		 * pw는 같아도 됨 id pw가 모두 같으면 덮어쓰기 됨
		 * 
		 */
		
		System.out.println(userList);

		//방법1. keySet을 이용
		//keySet()은 map에 있는 key들을 하나의 set에 담아 반환하는 메소드
		Set<String> keySet = userList.keySet();
		for(String tmp : keySet) {
			System.out.println(tmp + " : " + userList.get(tmp));
		}
		//방법2. EntrySet을 이용
		Set<Entry<String, String>> entrySet = userList.entrySet();
		for(Entry<String, String> tmp : entrySet) {
			System.out.println(tmp.getKey()+":"+ tmp.getValue());
		}
	}

}
