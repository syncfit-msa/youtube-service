package com.amcamp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class YoutubeServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(YoutubeServiceApplication.class, args);
    }

}
