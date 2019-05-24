package com.ww.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ww.entities.Book;
import com.ww.service.IBookService;

//type URL=http://localhost:2019/RestSpring/add/book
/*type in POST MAN ,method=POST,select "Body",than "raw",than "JSON(application/json)"
 * {
	"title":"ganesh chalisha",
	"author":"devine"
}*/
@RestController
@RequestMapping("/add")
public class BookController {

	@Autowired
	private IBookService bookService;

	/*---Add new book---*/
	@RequestMapping(value = "/book", method = RequestMethod.POST)
	public int save(@RequestBody Book book) {
		int id = bookService.save(book);
		// return ResponseBody.ok().body("New Book has been saved with ID:" +
		// id);
		return id;
	}

	@RequestMapping(value = "/auther", method=RequestMethod.GET)
	public String getAutherById(@RequestParam int id) {
		String auther = bookService.getAutherById(id);
		return auther;
	}

}
