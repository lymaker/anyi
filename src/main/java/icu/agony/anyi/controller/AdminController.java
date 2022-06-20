package icu.agony.anyi.controller;

import icu.agony.anyi.controller.param.LoginParam;
import icu.agony.anyi.model.consts.Status;
import icu.agony.anyi.service.AdminService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author LiuYun
 * @version 1.0
 */
@RestController
@RequestMapping("/admin")
@RequiredArgsConstructor
@Slf4j
public class AdminController {

    private final AdminService adminService;

    @PostMapping("/login")
    public Response login(@RequestBody @Validated LoginParam param) {
        adminService.login(param);
        return Response.of(Status.LOGIN_SUCCESS);
    }
}
