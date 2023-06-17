package com.nhnacademy.minidooray.hellogateway.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "nhn.api.domain")
@Getter
@Setter
public class DomainProperties {
    private String project;
    private String account;
}
