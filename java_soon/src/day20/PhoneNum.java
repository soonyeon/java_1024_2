package day20;

import lombok.Data;

@Data
public class PhoneNum {

	String name, pNum;

	@Override
	public String toString() {
		return "["+name + ":" + pNum + "]";
	}

	public PhoneNum(String name, String pNum) {
		super();
		this.name = name;
		this.pNum = pNum;
	}


	

}
