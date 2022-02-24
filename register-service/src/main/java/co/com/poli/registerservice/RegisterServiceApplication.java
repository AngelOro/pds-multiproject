package co.com.poli.registerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableEurekaServer
@SpringBootApplication
public class RegisterServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegisterServiceApplication.class, args);
    }

}
