package br.com.bootcampmongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootcampmongoApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootcampmongoApplication.class, args);
        System.out.println("\n\n API Rest com MongoDB funcionando!!! :)\n\n");
    }

}
