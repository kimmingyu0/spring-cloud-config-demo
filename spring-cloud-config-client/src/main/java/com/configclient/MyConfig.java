package com.configclient;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Data
@Component
@RefreshScope
public class MyConfig {

    @Value("${com.kmg.profile}")
    private String profile;

}
