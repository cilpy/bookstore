package io.pnt.edu.bookstore.service.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Service;

import io.pnt.edu.bookstore.dto.Book;
import io.pnt.edu.bookstore.service.BookService;

@Service("csvBookServiceImpl")
public class CsvBookServiceImpl implements BookService{
	
	
	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addBooks(Book... books) {
		// TODO Auto-generated method stub
		return 0;
	}

}
