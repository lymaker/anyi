package icu.agony.anyi.service;

import icu.agony.anyi.controller.param.LoginParam;

/**
 * @author LiuYun
 * @version 1.0
 */
public interface AdminService {
    boolean login(LoginParam param);

    void logout();

    boolean loginStatus();

}
