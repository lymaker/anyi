package icu.agony.anyi.exception;

import icu.agony.anyi.controller.Response;
import icu.agony.anyi.model.consts.Status;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author LiuYun
 * @version 1.0
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Response methodArgumentNotValidException() {
        return Response.of(Status.PARAM_ERROR);
    }

    @ExceptionHandler
    public Response exception(Exception e) {
        log.error("未知错误", e);
        return Response.of(Status.ERROR);
    }
}
