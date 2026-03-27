package org.example.base_code.exception.types;

import org.example.base_code.enums.ErrorCode;
import org.example.base_code.exception.BusinessException;
import org.springframework.http.HttpStatus;

public class ConflictException extends BusinessException {
    public ConflictException (String message) {
        super(message, HttpStatus.CONFLICT, ErrorCode.CONFLICT);
    }
}
