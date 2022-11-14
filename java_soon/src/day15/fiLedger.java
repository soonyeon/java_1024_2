package day15;

public class fiLedger {
	private String expected;
	private String price;
	
	public fiLedger(String expected, String price) {
		this.expected = expected;
		this.price = price;
	}

	@Override
	public String toString() {
		return "[" + expected + " : " + price + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((expected == null) ? 0 : expected.hashCode());
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
		fiLedger other = (fiLedger) obj;
		if (expected == null) {
			if (other.expected != null)
				return false;
		} else if (!expected.equals(other.expected))
			return false;
		return true;
	}


	


}
