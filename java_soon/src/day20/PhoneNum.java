package day20;

import lombok.Data;

@Data
public class PhoneNum {

	String name, num;

	@Override
	public String toString() {
		return "["+name + ":" + num + "]";
	}

	public PhoneNum(String name, String num) {
		super();
		this.name = name;
		this.num = num;
	}


	

}
