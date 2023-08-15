package com.example.demo.exceptions;

import com.example.demo.models.constants.ErrorCodes;
import com.example.demo.web.response.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = BadEntryException.class)
    public ResponseEntity<Response> notFoundException(BadEntryException exception) {
        Response response =  Response.builder().message(exception.getMessage())
                .status(ErrorCodes.BADREQUEST_ERROR.getStatus())
                .statusCode(HttpStatus.BAD_REQUEST.value()).status(ErrorCodes.INVALIDTITLE_ERROR.getStatus()).build();
        return  ResponseEntity.status(response.getStatusCode()).body(response);
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

    @ExceptionHandler(value = NotExistException.class)
    public ResponseEntity<Response> userNotFoundException(NotExistException exception) {
        Response response =  Response.builder().statusCode(HttpStatus.NOT_FOUND.value())
                .message(ErrorCodes.USER_NOTFOUND_ERROR.getMessage()).status(ErrorCodes.USER_NOTFOUND_ERROR.getStatus()).build();
        return  ResponseEntity.status(response.getStatusCode()).body(response);}

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
