package icu.agony.anyi.exception;

import cn.dev33.satoken.exception.NotLoginException;
import icu.agony.anyi.controller.Response;
import icu.agony.anyi.exception.admin.AdminNotFoundException;
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

    /**
     * 客户端传参
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Response methodArgumentNotValidException() {
        return Response.of(Status.PARAM_ERROR);
    }

    /**
     * 管理员未登录
     */
    @ExceptionHandler(NotLoginException.class)
    public Response notLoginException() {
        return Response.of(Status.OFF_LINE);
    }

    /**
     * 找不到管理员
     */
    @ExceptionHandler(AdminNotFoundException.class)
    public Response adminNotFoundException() {
        return Response.of(Status.LOGIN);
    }

    /**
     * 未知错误
     */
    @ExceptionHandler
    public Response exception(Exception e) {
        log.error("未知错误", e);
        return Response.of(Status.ERROR);
    }
}
