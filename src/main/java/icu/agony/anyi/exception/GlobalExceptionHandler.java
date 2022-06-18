package icu.agony.anyi.exception;

import icu.agony.anyi.controller.Response;
import icu.agony.anyi.model.consts.Status;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author LiuYun
 * @version 1.0
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Response methodArgumentNotValidException() {
        return Response.of(Status.PARAM_ERROR);
    }

    @ExceptionHandler(LoginException.class)
    public Response loginException() {
        return Response.of(Status.LOGIN_FAIL);
    }
}
