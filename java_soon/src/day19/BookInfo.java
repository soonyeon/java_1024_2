package day19;

import lombok.Data;

@Data
class BookInfo {
	
	private String title,authorName,publisher,ci,isbn;
	private int price;
	
	public BookInfo(String title, String authorName, int price, String ci, String publisher, String isbn) {
		super();
		this.title = title;
		this.authorName = authorName;
		this.publisher = publisher;
		this.ci = ci;
		this.price = price;
		this.isbn = isbn;
	}
	@Override
	public String toString() {
		return "도서명" + title + " | 저자명" + authorName + " | 출판사" +publisher + " | 분류" + ci
				+ " | 가격" + price+ " | ISBN" + isbn ;
	}

	

}