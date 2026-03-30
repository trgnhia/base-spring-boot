package org.example.base_code.exception;

import org.example.base_code.dto.response.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<ApiResponse<Void>> handleBusinessException (BusinessException ex) {
        return ResponseEntity.status(ex.getStatus())
                .body(ApiResponse.failure(
                        ex.getStatus().value(),
                        ex.getMessage(),
                        ex.getErrCode().name()
                ));
    }
}
