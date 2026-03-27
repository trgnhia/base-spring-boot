package org.example.base_code.dto.response;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponse<T> {
    private int status;
    private String message;
    private T data;
    private String errorCode;
    private boolean success;

    public static <T> ApiResponse<T> success (int status, T data, String message) {
        return ApiResponse.<T>builder()
                .status(status)
                .data(data)
                .success(true)
                .message(message)
                .build();
    }

    public static <T> ApiResponse<T> failure (int status, String message,String errorCode) {
        return ApiResponse.<T>builder()
                .status(status)
                .data(null)
                .success(false)
                .message(message)
                .errorCode(errorCode)
                .build();
    }
}