package icu.agony.anyi.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.io.File;

/**
 * @author LiuYun
 * @version 1.0
 */
@ConfigurationProperties(prefix = "anyi")
@Getter
@Setter
@ToString
public class AnYiProperties {
    private String workspace = System.getProperty("user.home") + File.separator + "anyi";
}
