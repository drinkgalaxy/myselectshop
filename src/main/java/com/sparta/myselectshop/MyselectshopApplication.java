package com.sparta.myselectshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling // 스케줄링 가능하게
@SpringBootApplication
@EnableJpaAuditing // JPA 엔티티에 자동으로 생성, 수정 시간 기록
public class MyselectshopApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyselectshopApplication.class, args);
    }
}
