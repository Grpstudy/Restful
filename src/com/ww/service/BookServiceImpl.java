package com.ww.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ww.dao.BookDaoImpl;
import com.ww.entities.Book;

@Service
@Transactional(readOnly = true)
public class BookServiceImpl implements IBookService {

	@Autowired
	private BookDaoImpl bookDaoimpl;

	@Transactional
	public int save(Book book) {

		return bookDaoimpl.save(book);
	}
	@Transactional
	public String getAutherById(int id) {
		return bookDaoimpl.getAutherById(id);
	}

}
