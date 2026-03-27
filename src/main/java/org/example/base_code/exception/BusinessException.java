package org.example.base_code.exception;

import org.example.base_code.enums.ErrorCode;
import org.springframework.http.HttpStatus;

public class BusinessException extends RuntimeException {
    private final HttpStatus status;
    private final ErrorCode errCode;

    protected BusinessException (String message, HttpStatus status, ErrorCode errCode) {
        super(message);
        this.status = status;
        this.errCode = errCode;
    }
}
