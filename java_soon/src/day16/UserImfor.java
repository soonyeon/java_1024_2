package day16;

public class UserImfor {

	private String ID;
	private String PW;
	private	String name;
	private int age;
	private int personalNum;
	
	
	@Override
	public String toString() {
		return "UserImfor [ID=" + ID + ", PW=" + PW + ", name=" + name + ", age=" + age + ", personalNum=" + personalNum
				+ "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserImfor other = (UserImfor) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	

	

}
