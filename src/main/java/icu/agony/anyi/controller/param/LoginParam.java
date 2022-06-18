package icu.agony.anyi.controller.param;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;

/**
 * @author LiuYun
 * @version 1.0
 */
@Getter
@Setter
@ToString
public class LoginParam {
    @NotEmpty
    private String username;

    @NotEmpty
    private String password;
}
