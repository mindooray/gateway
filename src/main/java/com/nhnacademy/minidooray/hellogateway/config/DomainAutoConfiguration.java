package com.nhnacademy.minidooray.hellogateway.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(DomainProperties.class)
public class DomainAutoConfiguration {
}
