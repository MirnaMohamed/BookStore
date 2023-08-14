package com.example.demo.exceptions;

import com.example.demo.entities.constants.enums.ErrorCodes;
import com.example.demo.web.response.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.sql.SQLException;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = BookNotFoundException.class)
    public ResponseEntity<Response> notFoundException(BookNotFoundException exception) {
        Response response =  Response.builder().message(exception.getMessage())
                .status(ErrorCodes.NOTFOUND_ERROR.getStatus()).statusCode(ErrorCodes.NOTFOUND_ERROR.getStatusCode())
                .build();
        return  ResponseEntity.status(ErrorCodes.NOTFOUND_ERROR.getStatusCode()).body(response);
        //return entity
        //404
        //status request level, response level
    }
//
//    @ExceptionHandler(value = BadEntryException.class)
//    public ResponseEntity<Response> badEntryException(BadEntryException  exception) {
//        Response response =  Response.builder().statusCode(ErrorCodes.BABREQUEST_ERROR.getStatusCode())
//                .message(ErrorCodes.BABREQUEST_ERROR.getMessage()).build();
//        return  ResponseEntity.internalServerError().body(response);}

    @ExceptionHandler(value = UserNotFoundException.class)
    public ResponseEntity<Response> userNotFoundException(UserNotFoundException  exception) {
        Response response =  Response.builder().statusCode(ErrorCodes.NOTFOUND_ERROR.getStatusCode())
                .message(ErrorCodes.NOTFOUND_ERROR.getMessage()).build();
        return  ResponseEntity.status(ErrorCodes.NOTFOUND_ERROR.getStatusCode()).body(response);}

//    //DB connection
//    @ExceptionHandler(value = SQLException.class)
//    public ResponseEntity<Response> notFoundException(SQLException  exception) {
//        Response response =  Response.builder().message(exception.getMessage())
//                .status(HttpStatus.NOT_FOUND.toString()).statusCode(HttpStatus.NOT_FOUND.value()).build();
//        return  ResponseEntity.internalServerError().body(response);
//        //return entity
//        //404
//        //status request level, response level
//    }
//
//
//
//    //DB Exception
//    @ExceptionHandler(value = Exception.class)
//    public ResponseEntity<Response> notFoundException(Exception  exception) {
//        Response response =  Response.builder().message(exception.getMessage())
//                .status(HttpStatus.NOT_FOUND.toString()).statusCode(HttpStatus.NOT_FOUND.value()).build();
//        return  ResponseEntity.internalServerError().body(response);
//     }


//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    @ExceptionHandler(BookNotFoundException.class)
//    public Map<String, String> handleValidationExceptions(
//            MethodArgumentNotValidException ex) {
//        //logger to check the exception
//        Map<String, String> errors = new HashMap<>();
//        ex.getBindingResult().getAllErrors().forEach((error) -> {
//            String fieldName = ((FieldError) error).getField();
//            String errorMessage = error.getDefaultMessage();
//            errors.put(fieldName, errorMessage);
//        });
//        return errors;
//    }
}
