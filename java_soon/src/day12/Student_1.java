package day12;

public class Student_1 {

}
	public static void main(String[] args) {
		public int geade, classNum, num;
		public String name;
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + classNum;
			result = prime * result + geade;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + num;
			return result;
		}
	
		@Override
		public boolean equals(Object obj) {
			//같은 객체 공유
			if (this == obj)
				return true;
			//null과 비교 불가능
			if (obj == null)
				return false;
			//obj가 같은 클래스의 객체가 아닌경우
			if (getClass() != obj.getClass())
				return false;
			Student other = (Student) obj;
			if (classNum != other.classNum)
				return false;
			if (geade != other.geade)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (num != other.num)
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Student [geade=" + geade + ", classNum=" + classNum + ", num=" + num + ", name=" + name + "]";
		}

		public void addScore(Score score) {
			// TODO Auto-generated method stub
			
		}
		
		

}
