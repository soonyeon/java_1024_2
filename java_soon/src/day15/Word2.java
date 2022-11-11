package day15;

public class Word2 {

		private String word;
		private String mean;
		


		

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Word2 other = (Word2) obj;
			if (mean == null) {
				if (other.mean != null)
					return false;
			} else if (!mean.equals(other.mean))
				return false;
			if (word == null) {
				if (other.word != null)
					return false;
			} else if (!word.equals(other.word))
				return false;
			return true;
		}





		@Override
		public String toString() {
			return "Word2 [word=" + word + ", mean=" + mean + "]";
		}
		


	

		
}
