package com.ww.service;

import com.ww.entities.Book;

public interface IBookService {
	public int save(Book book);
	
	public String getAutherById(int id);
}
