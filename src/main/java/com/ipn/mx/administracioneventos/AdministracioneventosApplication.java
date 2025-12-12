package com.ipn.mx.administracioneventos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;

@SpringBootApplication(
        exclude = {
                DataSourceAutoConfiguration.class,
                HibernateJpaAutoConfiguration.class,
                JpaRepositoriesAutoConfiguration.class
        }
)
@ComponentScan(
        basePackages = "com.ipn.mx.administracioneventos",
        excludeFilters = {
                @ComponentScan.Filter(type = FilterType.REGEX, pattern = "com\\.ipn\\.mx\\.administracioneventos\\.features\\..*"),
                @ComponentScan.Filter(type = FilterType.REGEX, pattern = "com\\.ipn\\.mx\\.administracioneventos\\.util\\.service\\..*")
        }
)
public class AdministracioneventosApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdministracioneventosApplication.class, args);
    }
}
