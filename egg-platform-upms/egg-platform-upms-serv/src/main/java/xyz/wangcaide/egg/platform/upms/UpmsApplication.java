package xyz.wangcaide.egg.platform.upms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("xyz.wangcaide.egg.platform.upms.mapper")
public class UpmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(UpmsApplication.class, args);
    }

}
