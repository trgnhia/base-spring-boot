package org.example.base_code.exception.types;

import org.example.base_code.enums.ErrorCode;
import org.example.base_code.exception.BusinessException;
import org.springframework.http.HttpStatus;

public class UnauthorizedException extends BusinessException {
    public UnauthorizedException (String message) {
        super(message, HttpStatus.UNAUTHORIZED, ErrorCode.UNAUTHORIZED);
    }
}
