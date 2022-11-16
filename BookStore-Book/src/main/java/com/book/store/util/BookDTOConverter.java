package com.book.store.util;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.book.store.dto.BookResponseDTO;
import com.book.store.dto.DefaultResponseDTO;
import com.book.store.entity.Book;

@Component
@Scope("singleton")
public class BookDTOConverter {
	
	
	
	public static  BookResponseDTO convertToDTO(Book book)
	{
		return new BookResponseDTO(book.getIsbNumber(), book.getTitle(), book.getPrice(), book.getCategory());
	}

}

