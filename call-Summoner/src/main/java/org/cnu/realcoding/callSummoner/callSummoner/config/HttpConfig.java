package org.cnu.realcoding.callSummoner.callSummoner.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

@Configuration
public class HttpConfig {

    @Bean
    public RestTemplate createRestTemplate() {
        return new RestTemplate();
    }

}