package icu.agony.anyi.controller;

import icu.agony.anyi.controller.param.LoginParam;
import icu.agony.anyi.model.consts.Status;
import icu.agony.anyi.service.AdminService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


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
        return adminService.login(param) ? Response.of(Status.LOGIN_OK) : Response.of(Status.LOGIN);
    }

    @DeleteMapping("/logout")
    public void logout() {
        adminService.logout();
    }

    @GetMapping("/login-status")
    public Response loginStatus() {
        return adminService.loginStatus() ? Response.of(Status.ON_LINE_OK) : Response.of(Status.OFF_LINE);
    }
}
