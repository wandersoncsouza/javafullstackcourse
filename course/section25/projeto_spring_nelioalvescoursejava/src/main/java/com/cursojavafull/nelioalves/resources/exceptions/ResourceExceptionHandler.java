package com.cursojavafull.nelioalves.resources.exceptions;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.cursojavafull.nelioalves.services.exceptions.DatabaseException;
import com.cursojavafull.nelioalves.services.exceptions.ResourceNotFoundException;

@ControllerAdvice	// Intercepta as exceções para que esse objeto execute os tratamentos
public class ResourceExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)  // Para que ele seja capaz de interceptar a requisição que deu exceção desse tipo (ResourceNotFoundException)
	public ResponseEntity<StandardError> resouceNotFound(ResourceNotFoundException e, HttpServletRequest request){
		String error = "Resource not found";
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandardError err = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
		return ResponseEntity.status(status).body(err);
	}
	
	@ExceptionHandler(DatabaseException.class)  // Para que ele seja capaz de interceptar a requisição que deu exceção desse tipo (ResourceNotFoundException)
	public ResponseEntity<StandardError> database(DatabaseException e, HttpServletRequest request){
		String error = "Database error";
		HttpStatus status = HttpStatus.BAD_REQUEST;
		StandardError err = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
		return ResponseEntity.status(status).body(err);
	}
}
