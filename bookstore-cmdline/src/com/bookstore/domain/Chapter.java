package com.bookstore.domain;

public class Chapter {
	private String title;
	private Integer chaptername;
	public Chapter(String title, Integer chaptername) {
		super();
		this.title = title;
		this.chaptername = chaptername;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getChaptername() {
		return chaptername;
	}
	public void setChaptername(Integer chaptername) {
		this.chaptername = chaptername;
	}
	@Override
	public String toString() {
		return "Chapter [title=" + title + ", chaptername=" + chaptername + "]";
	}
	
	
}
