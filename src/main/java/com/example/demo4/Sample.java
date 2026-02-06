package com.example.demo4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class Sample {

    private static final Logger logger = LoggerFactory.getLogger(Sample.class);

    @GetMapping("/sample")
    public String instance(@Autowired InstanceId instanceId) {
        return "Instance: " + instanceId.getId();
    }


    @Value("${POD_NAME:unknown}")
    private String podName;

    @GetMapping("/whoami")
    public String whoAmI() {
        return "Atendido por el pod: " + podName;
    }

}
