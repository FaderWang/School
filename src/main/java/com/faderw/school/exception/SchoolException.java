package com.faderw.school.exception;

/**
 * Created by FaderW on 2018/7/17
 */

public class SchoolException extends RuntimeException {
    private static final long serialVersionUID = 1L;

	public SchoolException() {
        super();
    }

    public SchoolException(String message) {
        super(message);
    }
}
