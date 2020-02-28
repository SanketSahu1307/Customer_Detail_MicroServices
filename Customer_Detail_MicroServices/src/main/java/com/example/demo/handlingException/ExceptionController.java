package com.example.demo.handlingException;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@Controller
@ControllerAdvice
public class ExceptionController extends ResponseEntityExceptionHandler{
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<Object> userNotFoundException(UserNotFoundException ex,WebRequest request) throws Exception{
		ErrorModal error=new ErrorModal(new Date(),ex.getMessage(),request.getDescription(false));
		return new ResponseEntity<Object>(error,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value = {Exception.class})
	public ResponseEntity<Object> handleAnyException(Exception ex,WebRequest request) throws Exception{
		ErrorModal error=new ErrorModal(new Date(),ex.getMessage(),request.getDescription(false));
		return new ResponseEntity<Object>(error,HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
