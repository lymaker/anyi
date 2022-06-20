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
    LOGIN_OK(21001, "登录成功"),
    LOGIN(41001, "登录失败"),

    ON_LINE_OK(21002, "在线"),
    OFF_LINE(41002, "离线"),

    // error
    ERROR(50000, "未知错误"),
    PARAM_ERROR(50001, "参数错误");

    private final Integer code;
    private final String message;
}
