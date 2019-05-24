package com.ww.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.ww.entities.Book;

@Repository
public class BookDaoImpl {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public int save(Book book) {
		int id = 0;
		id = (int) hibernateTemplate.save(book);
		return id;
	}

	public String getAutherById(int id) {
		String author = null;
		author = (String) hibernateTemplate.save(author);
		return author;

	}
}
