package kr.kh.spring;

public class InfoVo {
	private String name;
	private int num;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "InfoVo [name=" + name + ", num=" + num + "]";
	}
	public InfoVo(String name, int num) {
		this.name = name;
		this.num = num;
	}

	

}
