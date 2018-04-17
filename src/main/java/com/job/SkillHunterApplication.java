package com.job;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan // 注意要加上@ServletComponentScan注解，否则Servlet无法生效
public class SkillHunterApplication {

    public static void main(String[] args) {
        SpringApplication.run(SkillHunterApplication.class, args);
    }
}
