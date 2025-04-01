package com.amcamp.infra.config.properties;

import com.amcamp.infra.config.youtube.YoutubeProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@EnableConfigurationProperties({
        YoutubeProperties.class,
})
@Configuration
public class PropertiesConfig {
}