package day19;

public class BookInfo {

	private String title,authorName,publisher,ci;

	public BookInfo(String title, String authorName, String publisher, String ci) {
		super();
		this.title = title;
		this.authorName = authorName;
		this.publisher = publisher;
		this.ci = ci;
	}

	@Override
	public String toString() {
		return "BookInfo [title=" + title + ", authorName=" + authorName + ", publisher=" + publisher + ", ci=" + ci
				+ "]";
	}

	
		
		
		
		
	

}
