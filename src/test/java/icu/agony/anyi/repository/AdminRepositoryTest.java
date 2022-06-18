package icu.agony.anyi.repository;

import cn.dev33.satoken.secure.SaSecureUtil;
import icu.agony.anyi.annotation.AnYiTest;
import org.junit.jupiter.api.Test;

/**
 * @author LiuYun
 * @version 1.0
 */
@AnYiTest
public class AdminRepositoryTest {
    @Test
    public void generateAdminPasswordTest() {
        String pwd = SaSecureUtil.sha256("admin");
        System.out.printf("admin password is -> %s%n", pwd);
    }
}
