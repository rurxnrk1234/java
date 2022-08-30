package kr.brains.project;

import java.time.LocalDateTime;
import java.util.Objects;

// 웹툰 등록, 조회
// 웹툰은 Book 종류이다.
// 웹툰의 주요 속성은? 제목, 장르,저자,판매부수, 

public class Webtoon implements Book {
	private String title;
	private String genre;
	private String author;
	private LocalDateTime date;
	private int count;
	
	public Webtoon() {};
	public Webtoon(String isbn,String title,String genre,String author,String date);
		this.isbn = isbn;
		this.title = title;
		this.genre = genre;
		this.author = author;
		this.date = Local
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	private String title;
	private String genre;
	private String author;
	private LocalDateTime date;
	private int count;
	

}
