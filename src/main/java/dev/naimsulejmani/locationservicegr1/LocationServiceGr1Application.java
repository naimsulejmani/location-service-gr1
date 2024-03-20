package dev.naimsulejmani.locationservicegr1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class LocationServiceGr1Application {

    public static void main(String[] args) {
        SpringApplication.run(LocationServiceGr1Application.class, args);
    }

}
