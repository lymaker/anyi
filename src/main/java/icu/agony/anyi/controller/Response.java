package icu.agony.anyi.controller;

import com.fasterxml.jackson.annotation.JsonInclude;
import icu.agony.anyi.model.consts.Status;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author LiuYun
 * @version 1.0
 */
@Getter
@Setter
@ToString
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Response {
    private final Integer code;
    private final String message;
    private Object data;

    private Response(Status status, Object data) {
        this.code = status.getCode();
        this.message = status.getMessage();
        this.data = data;
    }

    public static Response of(Status status) {
        return of(status, null);
    }

    public static Response of(Status status, Object data) {
        return new Response(status, data);
    }
}
