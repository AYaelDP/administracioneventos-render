package com.ipn.mx.administracioneventos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
@ComponentScan(
        basePackages = "com.ipn.mx.administracioneventos",
        excludeFilters = {
                @ComponentScan.Filter(
                        type = FilterType.REGEX,
                        pattern = "com\\.ipn\\.mx\\.administracioneventos\\.features\\..*"
                )
        }
)
public class AdministracioneventosApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdministracioneventosApplication.class, args);
    }
}
