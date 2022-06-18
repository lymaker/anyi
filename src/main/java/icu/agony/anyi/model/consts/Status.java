package icu.agony.anyi.model.consts;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 状态码
 *
 * @author LiuYun
 * @version 1.0
 */
@Getter
@AllArgsConstructor
public enum Status {
    // admin status
    LOGIN_SUCCESS(21001, "登录成功"),
    LOGIN_FAIL(41001, "登陆失败"),

    // param status
    PARAM_ERROR(40001, "参数错误");


    private final Integer code;
    private final String message;
}
