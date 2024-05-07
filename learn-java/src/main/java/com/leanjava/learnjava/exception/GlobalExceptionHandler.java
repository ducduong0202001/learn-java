package com.leanjava.learnjava.exception;

import com.leanjava.learnjava.dto.request.ApiReponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = RuntimeException.class)
        ResponseEntity<ApiReponse> handlingRuntimeException(RuntimeException exception){
        ApiReponse apiReponse = new ApiReponse();
        apiReponse.setCode(1000);
        apiReponse.setMessage(exception.getMessage());
        return ResponseEntity.badRequest().body(apiReponse);
    }

    @ExceptionHandler(value = AppException.class)
    ResponseEntity<ApiReponse> handlingRuntimeException(AppException exception){
        ApiReponse apiReponse = new ApiReponse();
        apiReponse.setCode(exception.getErrCode().getCode());
        apiReponse.setMessage(exception.getErrCode().getMessage());
        return ResponseEntity.badRequest().body(apiReponse);
    }
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    ResponseEntity<ApiReponse> handlingValidationExption(MethodArgumentNotValidException excption){
        String enumKey =excption.getFieldError().getDefaultMessage();
        ErrCode errCode = ErrCode.valueOf(enumKey);
        ApiReponse apiReponse = new ApiReponse();
        apiReponse.setCode(errCode.getCode());
        apiReponse.setMessage(errCode.getMessage());
        return ResponseEntity.badRequest().body(apiReponse);
    }
}
