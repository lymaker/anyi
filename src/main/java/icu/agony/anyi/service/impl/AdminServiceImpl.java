package icu.agony.anyi.service.impl;

import cn.dev33.satoken.secure.SaSecureUtil;
import cn.dev33.satoken.stp.StpUtil;
import icu.agony.anyi.controller.param.LoginParam;
import icu.agony.anyi.model.entity.AdminEntity;
import icu.agony.anyi.repository.AdminRepository;
import icu.agony.anyi.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

/**
 * @author LiuYun
 * @version 1.0
 */
@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService {

    private final AdminRepository adminRepository;

    private final ModelMapper modelMapper;

    @Override
    public boolean login(LoginParam param) {
        AdminEntity entity = modelMapper.map(param, AdminEntity.class);

        // 密码加密
        String encrypt = SaSecureUtil.sha256(entity.getPassword());
        entity.setPassword(encrypt);

        Example<AdminEntity> example = Example.of(entity);
        if (adminRepository.findOne(example).isPresent()) {
            StpUtil.login(param.getUsername());
            return true;
        }
        return false;
    }

    @Override
    public void logout() {
        StpUtil.logout();
    }

    @Override
    public boolean loginStatus() {
        return StpUtil.isLogin();
    }
}
