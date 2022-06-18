package icu.agony.anyi.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author LiuYun
 * @version 1.0
 */
@SpringBootConfiguration
@EnableConfigurationProperties(AnYiProperties.class)
@EnableJpaRepositories(basePackages = "icu.agony.anyi.repository")
public class AnYiConfiguration {
}
