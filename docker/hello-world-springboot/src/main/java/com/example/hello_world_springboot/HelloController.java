package com.example.hello_world_springboot;

import java.net.InetAddress;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public Map<String, String> hello() throws Exception {
        String env = System.getenv().getOrDefault("ENV_VALUE", "No env set");
        String hostname = InetAddress.getLocalHost().getHostName();

        return Map.of("message", "Hello from Simple App (Java Spring Boot)", "env", env, "container", hostname);
    }
}