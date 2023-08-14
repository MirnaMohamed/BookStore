package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.oas.annotations.EnableOpenApi;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
//@EnableSwagger2
//@EnableOpenApi
public class DemoApplication  {
//	public void setBookService(BookServiceImpl bookService) {
//		this.bookService = bookService;
//	}

	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);
//		LOG.info("STARTING THE APPLICATION");
		SpringApplication.run(DemoApplication.class, args);
//		LOG.info("APPLICATION FINISHED");
	}
//	@Bean
//	public Docket productApi() {
//		return new Docket(DocumentationType.SWAGGER_2).select()
//				.apis(RequestHandlerSelectors.basePackage("com.example.demo")).build();
//	}

//	@Override
//	public void run(String... args) {
////		LOG.info("EXECUTING : command line runner");
////		BookServiceImpl bookService = BookServiceImpl.getBookService();
////		bookService.getBooks();
////		bookService.getBooks().forEach(System.out::println);
////		List<Book> bookList = bookService.getBooks();
////		System.out.println(bookList.get(0).description);
//	}
}
