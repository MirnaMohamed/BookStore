package com.example.demo.web.controller;

import com.example.demo.dtos.BookDto;
import com.example.demo.services.BookService;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/api/books")
public class BookController {
    @Autowired
    BookService bookService;
//    @Operation(
//            summary = "Retrieve a book by Id",
//            description = "Get a Tutorial object by specifying its id. The response is Tutorial object with id, title, description and published status.",
//            tags = { "tutorials", "get" })
//    @ApiResponses({
//            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = Book.class), mediaType = "application/json") }),
//            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
//            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    @PostMapping
    public ResponseEntity<String> addBook(@Valid @RequestBody BookDto bookDto) {
         bookService.save(bookDto);
         return ResponseEntity.ok("Book added successfully");
    }

    @GetMapping
    public List<BookDto> findAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping(value ="/title")
    public BookDto findBooksByTitle(@Valid @RequestParam String title) {
        return bookService.findBookByTitle(title);
    }

    @GetMapping("{id}")
    public BookDto findBookById(@PathVariable int id)  {
        return bookService.getById(id);
    }

    @PutMapping("/id")
    public ResponseEntity<String> updateProduct(@RequestBody BookDto bookDto, @RequestParam Integer id) {
        bookDto.setId(id);
        bookService.update(id, bookDto);
        return ResponseEntity.ok("Book updated");
    }

    @DeleteMapping("{id}")
    public String deleteProduct(@PathVariable int id) {
        bookService.deleteViaId(id);
        return "Book Deleted";
    }
//    @GetMapping
//    public String showAll(Model model) {
//        model.addAttribute("books", bookService.getAllBooks());
//        return "index";
//    }
//
//    @GetMapping("/{title}")
//    public String showByTitle(@PathVariable(value = "title") String title, Model model) {
//        model.addAttribute("books", bookService.getBooksByTitle(title));
//        return "bytitle";
//    }
//
//    @GetMapping("/addbook")
//    public String addNewEmployee(Model model) {
//        Book book = new Book();
//        model.addAttribute("book", book);
//        return "create";
//    }
//    @PostMapping("/save")
//    public String saveEmployee(@ModelAttribute("book") Book book) {
//        bookService.save(book);
//        return "redirect:/";
//    }
//    @GetMapping("/showFormForUpdate/{id}")
//    public String updateForm(@PathVariable(value = "id") Integer id, Model model) {
//        BookDto book = bookService.getById(id);
//        bookService.update(book);
//        model.addAttribute("book", book);
//        return "update";
//    }
//
//    @GetMapping("/deleteEmployee/{id}")
//    public String deleteThroughId(@PathVariable(value = "id") Integer id) {
//        bookService.deleteViaId(id);
//        return "redirect:/";
//
//    }
    //create repository package, controller unit test for the bookstore
    //module validation to unit testing hibernate
    //hibernate ORM, Hibernate Search where, like, Hibernate Reactive , Hibernate tools, Hibernate Validator

//    @GetMapping("/{id}")
//    public ResponseEntity<Book> getBookById(@PathVariable("id") Integer id) {
//        Book tutorialData = bookDbRepository.getById(id);
//            return new ResponseEntity<>(tutorialData, HttpStatus.OK);
//    }
//    @PostMapping("/add")
//    public String addBook(@RequestBody Book book) {
////            Book book1 = new Book();
////            book1.setTitle(book.getTitle()); book1.setDescription(book.getDescription());
////            book1.setPrice(book.price);
//            Book _tutorial = bookDbRepository
//                    .save(book);
//            return "create";
//    }
//@GetMapping("/add")
//public String showSignUpForm(Book user) {
//    return "create";
//}
//    @DeleteMapping("/delete/{id}")
//    public ResponseEntity<HttpStatus> deleteBook(@PathVariable("id") Integer id) {
//        try {
//            bookDbService.deleteViaId(id);
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        } catch (Exception e) {
//            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//    @RequestMapping(value="/create", method=RequestMethod.POST)
//    public void addUser(@RequestBody Book book)
//    {
//        bookService.addBook(book);
//    }
//    @PostMapping("/add")
//    public String addBook(@RequestBody Book product) {
//        bookService.addBook(product);
//        return "Book added Successfully";
//    }

//    @GetMapping
//    public String findAllBooks() {
//        return bookService.getBooks().toString();
//    }

//    @GetMapping("/addnew")
//    public String addBook(Model model) {
//        Book book = new Book();
//        model.addAttribute("book", book);
//        return "create";
//    }
//    @GetMapping("{id}")
//    public Book findBookById(@PathVariable int id) {
//        return bookService.getBookById(id);
//    }
//    @GetMapping("{id}")
//    public Book findBookById(@PathVariable int id) {
//        return bookService.getBookById(id);
//    }
//
//
//    @PutMapping("/edit/{id}")
//    public Book updateProduct(@RequestBody int id) {
//        return bookService.update(findBookById(id));
//    }
//    @GetMapping("/create")
//    public String showCreateForm(Model model) {
//        BookDto booksForm = new BookDto();
//
//        for (int i = 1; i <= 3; i++) {
//            booksForm.addBook(new Book());
//        }
//
//        model.addAttribute("form", booksForm);
//        return "books/createBooksForm";
//    }
//    @DeleteMapping("/delete/{id}")
//    public String deleteProduct(@PathVariable int id) {
//        try {
//            bookService.removeBook(id);
//            return "Book removed!";
//        }
//        catch (BookNotFoundException e){
//            return "Book is not found";}
//    }

//    @RequestMapping("/view-products")
//    public String viewProducts() {
//        return "view-products";
//    }
//    @RequestMapping("/add-products")
//    public String addProducts() {
////        bookService.addBook(book);
//        return "create";
//    }
//    @PostMapping("/save")
//    public String saveBooks(@ModelAttribute BookDto form, Model model) {
//        bookService.addAllBook(form.getBooks());
//
//        model.addAttribute("books", bookService.getBooks());
//        return "redirect:/books/all";
//    }
//    @RequestMapping("/get")
//    public String getAllBooks(){
//        return bookService.getBooks().get(0).toString();
//    }
}
