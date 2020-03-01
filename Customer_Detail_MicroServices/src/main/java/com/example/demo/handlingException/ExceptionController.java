package com.example.demo.handlingException;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestController
@ControllerAdvice
public class ExceptionController extends ResponseEntityExceptionHandler{
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<Object> userNotFoundException(UserNotFoundException ex,WebRequest request) throws Exception{
		ErrorModal error=new ErrorModal(new Date(),ex.getMessage(),request.getDescription(false));
		return new ResponseEntity<Object>(error,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value = {RuntimeException.class})
	public ResponseEntity<Object> handleAnyException(RuntimeException ex,WebRequest request) throws RuntimeException{
		ErrorModal error=new ErrorModal(new Date(),ex.getMessage(),request.getDescription(false));
		return new ResponseEntity<Object>(error,HttpStatus.NOT_FOUND);
	}
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(
		MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
		ErrorModal error=new ErrorModal(new Date(),"Validation Failed",ex.getBindingResult().toString());
		return new ResponseEntity<Object>(error,HttpStatus.BAD_GATEWAY);
	}
	
	
}
