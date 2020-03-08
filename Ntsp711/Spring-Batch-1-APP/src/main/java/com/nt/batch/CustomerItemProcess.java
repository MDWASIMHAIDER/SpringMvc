package com.nt.batch;

import org.springframework.batch.item.ItemProcessor;

public class CustomerItemProcess implements ItemProcessor<String,String> {

	@Override
	public String process(String bookNameWithoutAuthor) throws Exception {
		System.out.println("CustomerItemProcess.process()");
		String bookNameWithAuthor="Book Name "+bookNameWithoutAuthor+" Author Name";
		if("core java".equalsIgnoreCase(bookNameWithoutAuthor)) {
			bookNameWithAuthor+=" srinivas";
		}
		else if("Design Pattern".equalsIgnoreCase(bookNameWithoutAuthor)) {
			bookNameWithAuthor+=" raja";
		}
		else if("Spring".equalsIgnoreCase(bookNameWithoutAuthor)) {
			bookNameWithAuthor+=" wasim";
		}
		else if("Hibernate".equalsIgnoreCase(bookNameWithoutAuthor)) {
			bookNameWithAuthor+=" Nataraj";
		}
		else if("Hibernate".equalsIgnoreCase(bookNameWithoutAuthor)) {
			bookNameWithAuthor+="Choudhary";
		}
		return bookNameWithAuthor;
	}

	

	

	

}
