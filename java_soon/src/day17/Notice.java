package day17;


public class Notice {

	private String title, content, name, date, viewcount;
	private int num;
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
	
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	
	
}
