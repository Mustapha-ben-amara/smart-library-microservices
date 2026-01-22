package com.smartlibrary.api_gateway.filter;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Mono;

@Configuration
public class LoggingFilter {

    private static final Logger log = LoggerFactory.getLogger(LoggingFilter.class);

    @Bean
    public GlobalFilter globalLoggingFilter() {
        return (exchange, chain) -> {
            log.info("Incoming request: {} {}",
                    exchange.getRequest().getMethod(),
                    exchange.getRequest().getURI());

            return chain.filter(exchange).then(
                    Mono.fromRunnable(() ->
                            log.info("Outgoing response: {}",
                                    exchange.getResponse().getStatusCode())
                    )
            );
        };
    }
}
