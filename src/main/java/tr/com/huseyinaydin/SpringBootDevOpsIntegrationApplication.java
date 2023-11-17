package tr.com.huseyinaydin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDevOpsIntegrationApplication {

    @GetMapping("/selam")
    public String selamlar(){
        return "Selamun aleyküm";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDevOpsIntegrationApplication.class, args);
    }

}
