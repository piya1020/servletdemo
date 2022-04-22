package com.bookstore.client;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bookstore.domain.Book;
import com.bookstore.domain.Chapter;
import com.bookstore.domain.Publisher;
import com.bookstore.services.BookStoreService;

public class bookstoreclient {
	public static void main(String[] args) {
		BookStoreService bookStoreService = new BookStoreService();
		
		Publisher publisher = new Publisher("Sanem", "albatross");
		
		Book book = new Book("45HT89RRE", "Love Story", publisher);
		
		Chapter chapter1 = new Chapter("Jaan", 1);
		Chapter chapter2 = new Chapter("Can", 2);
		
		List<Chapter> chapters = new ArrayList<Chapter>();
		chapters.add(chapter1);
		chapters.add(chapter2);
		
		//book.setChapters(chapters);
		
		/*
		 * Persist Object Graph
		 */
		/*try {
			bookStoreService.persistObjectGraph(book);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		/*
		 * Retrieve Object Graph
		 */
		System.out.println(bookStoreService.retrieveObjectGraph("1234567898"));
		//System.out.println(bookStoreService.retrieveObjectGraph("45HT89RRE"));

}
}