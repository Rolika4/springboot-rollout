package com.epam.edp.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Pavlo_Yemelianov
 */
@RestController
public class HelloEdpController {

    @GetMapping(value = "/api/hello")
    public String hello() {
        String podName = System.getenv("HOSTNAME");
        return "Hello, KubeRocketCI from " + podName;

    }
}
