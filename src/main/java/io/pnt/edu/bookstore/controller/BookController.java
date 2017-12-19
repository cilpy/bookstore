package io.pnt.edu.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;

import io.pnt.edu.bookstore.dto.Book;
import io.pnt.edu.bookstore.service.BookService;

@Controller
public class BookController {
	
	@Autowired
	@Qualifier("csvBookServiceImpl2")
	BookService bookService;
	
	@RequestMapping("/")
	public String index(Model model){
		model.addAttribute("title", "호서 서점");
		model.addAttribute("books", bookService.findAll());
		return "index";
	}
	
	@RequestMapping("/search")
	public String search(Model model,
			@RequestParam(name="keyword", defaultValue="") String keyword){
		model.addAttribute("title", keyword + " 검색 결과 : ");
		model.addAttribute("books", bookService.findByName(keyword));
		return "index";
	}	
	
	@RequestMapping("/rest/all")
	@ResponseBody
	public List<Book> findAll(){
		return bookService.findAll();
	}
}
