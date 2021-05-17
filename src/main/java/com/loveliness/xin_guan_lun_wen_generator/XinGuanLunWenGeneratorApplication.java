package com.loveliness.xin_guan_lun_wen_generator;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.loveliness.xin_guan_lun_wen_generator.mapper")
public class XinGuanLunWenGeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(XinGuanLunWenGeneratorApplication.class, args);
    }

}
