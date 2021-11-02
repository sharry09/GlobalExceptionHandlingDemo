package com.capgemini.globalhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.capgemini.exception.InsufficientDataException;

@ControllerAdvice
public class MyGlobalHandler {
@ExceptionHandler(InsufficientDataException.class)
public ResponseEntity<String> handleException(InsufficientDataException i){
	return new ResponseEntity<String>("Please enter Valid Data",HttpStatus.BAD_REQUEST);
}
}
