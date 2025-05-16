package com.assesment.StudentManagement.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(StudentNotFoundException.class)
    public ResponseEntity<Map<String,Object>> handleStudentNotFoundException(StudentNotFoundException ex){
        Map<String, Object> error = new HashMap<>();
        error.put("timeStamp", LocalDate.now());
        error.put("message",ex.getMessage());
        error.put("status",HttpStatus.NOT_FOUND.value());
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }



}
