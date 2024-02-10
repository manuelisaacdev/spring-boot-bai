package com.bai.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BadRequestException extends RuntimeException {
	public BadRequestException(String message) {
		super(message);
	}
	public BadRequestException(Throwable throwable) {
		super(throwable);
	}
}