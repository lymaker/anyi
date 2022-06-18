package icu.agony.anyi.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author LiuYun
 * @version 1.0
 */
@SpringBootConfiguration
@EnableConfigurationProperties(AnYiProperties.class)
@EnableJpaRepositories(basePackages = "icu.agony.anyi.repository")
public class AnYiConfiguration {
    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
