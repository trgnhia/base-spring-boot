package org.example.base_code.exception.types;

import org.example.base_code.enums.ErrorCode;
import org.example.base_code.exception.BusinessException;
import org.springframework.http.HttpStatus;

public class BadRequestException extends BusinessException {
    public BadRequestException (String message) {
        super(message, HttpStatus.BAD_REQUEST, ErrorCode.BAD_REQUEST);
    }
}
