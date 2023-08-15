package com.example.demo.services;

import com.example.demo.entities.Book;
import com.example.demo.dtos.BookDto;
import com.example.demo.entities.constants.enums.ErrorCodes;
import com.example.demo.exceptions.BookNotFoundException;
import com.example.demo.repositories.BookRepository;
import com.example.demo.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

        @Autowired
        private BookRepository bookRepo;
        @Autowired
        private BookMapper bookMapper;
        List<BookDto> bookDtos = new ArrayList<>();

        public List<BookDto> getAllBooks()
        {
            List<Book> books = bookRepo.findAll();
            List<BookDto> bookDtos = new ArrayList<>();
            books.forEach(book -> bookDtos.add(bookMapper.bookToBookDto(book)));
//            Query query = em.createQuery("SELECT c FROM Country c");
//            List results = query.getResultList();
            return bookDtos;
        }
        public BookDto findBookByTitle(String title)
        {
            Optional<Book> optional = bookRepo.findByTitleLike(title);
//            BookDto bookDto = bookMapper.bookToBookDto(book);
            BookDto bookDto;
            if (optional.isPresent()){
//                bookDto = optional.get();
                bookDto = bookMapper.bookToBookDto(optional.get());
                return bookDto;
            }
            else {
//                throw new BookNotFoundException("book not found");
                throw new BookNotFoundException(title + " is not found");

            }
//            books.forEach(book -> bookDtos.add(bookMapper.bookToBookDto(book)));
        }
        public List<Book> getBooksByAuthor(String author)
        {
            List<Book> book = bookRepo.findByAuthor(author);
            return book;
        }
        public void save(BookDto bookDto)
        {

            Book book = bookMapper.DtoToEntity(bookDto);
            bookRepo.save(book);
        }



    public BookDto getById(Integer id) throws BookNotFoundException {
            Optional<Book> optional = bookRepo.findById(id);
            BookDto bookDto;
//            BookDto bookDto = bookMapper.bookToBookDto(optional.get());
//            Book book = optional.get();
            if (optional.isPresent()){
//                bookDto = optional.get();
                bookDto = bookMapper.bookToBookDto(optional.get());
                return bookDto;
            }
            else {
//                throw new BookNotFoundException("book not found");
                throw new BookNotFoundException("Book with id:" + id + " is not found");

            }
        }
        public void update(BookDto bookDto)
        {
            Book book = bookMapper.DtoToEntity(bookDto);

            bookRepo.save(book);
        }

        public void deleteViaId(Integer id)
        {
            bookRepo.deleteById(id);
        }
    }