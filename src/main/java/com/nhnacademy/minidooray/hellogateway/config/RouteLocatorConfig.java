package com.nhnacademy.minidooray.hellogateway.config;

import lombok.RequiredArgsConstructor;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class RouteLocatorConfig {
    private final DomainProperties domainProperties;

    @Bean
    public RouteLocator myRoute(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("project-api",
                        p -> p.path("/project-api/**").and()
//                                .weight("hello-service", 50)
                                .uri(domainProperties.getProject())
                )
                .route("account-api",
                        p -> p.path("/account-api/**").and()
//                                .weight("hello-service", 50)
                                .uri(domainProperties.getAccount())
                )
                .build();
    }
}
