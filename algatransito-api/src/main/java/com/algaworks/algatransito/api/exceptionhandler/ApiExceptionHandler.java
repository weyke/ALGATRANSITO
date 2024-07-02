package com.algaworks.algatransito.api.exceptionhandler;

import java.net.URI;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.algaworks.algatransito.domain.exception.NegocioException;

@RestControllerAdvice
public class ApiExceptionHandler extends ResponseEntityExceptionHandler {

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			                                                      org.springframework.http.HttpHeaders headers, HttpStatusCode status,
			                                                      WebRequest request) {
		ProblemDetail problemDetail = ProblemDetail.forStatus(status);
		problemDetail.setTitle("Um ou mais campos estão inválidos");
		problemDetail.setType(URI.create("https://algatransito.com/erros/campos-invalidos"));

		return handleExceptionInternal(ex, problemDetail, headers, status, request);
	}

	@ExceptionHandler(NegocioException.class)
	public ResponseEntity<String> capturar(NegocioException e) {
		return ResponseEntity.badRequest().body(e.getMessage());

	}

}
