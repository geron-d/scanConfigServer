package by.geron.scanconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ScanConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScanConfigServerApplication.class, args);
    }

}
