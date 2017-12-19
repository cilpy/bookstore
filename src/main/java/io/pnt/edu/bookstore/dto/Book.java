package io.pnt.edu.bookstore.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book implements Serializable {
	private int seq;
	private String title;
	private String author;
	private String publisher;
	private double price;
}
