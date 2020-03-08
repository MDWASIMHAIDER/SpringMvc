package com.nt.batch;

import java.util.List;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

public class CustomerItemReader implements ItemReader<String> {

	private int bookCount;
	List<String>bookNameList;
	@Override
	public String read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		System.out.println("itemReader-read()");
		if(bookCount<bookNameList.size()) {
			return bookNameList.get(bookCount++);
		}
		else {
			return null;
		}
	}
 
	public void setBookNameList(List<String>bookList) {
		this.bookNameList=bookList;
	}
}
