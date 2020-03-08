package com.nt.batch;

import java.awt.print.Book;
import java.util.List;

import org.springframework.batch.item.ItemWriter;

public class CustomerItemWriter implements ItemWriter<String> {

	@Override
	public void write(List<? extends String> bookNameWithAuthor) throws Exception {
		System.out.println("CustomerItemWriter.write()");
		System.out.println(bookNameWithAuthor);
		
	}



}
