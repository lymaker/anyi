package icu.agony.anyi.controller.param;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

/**
 * @author LiuYun
 * @version 1.0
 */
@Getter
@Setter
@ToString
public class LoginParam {
    @NotEmpty
    @Size(min = 6, max = 11)
    private String username;

    @NotEmpty
    private String password;
}
