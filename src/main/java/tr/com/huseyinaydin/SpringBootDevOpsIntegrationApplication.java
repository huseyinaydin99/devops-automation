package tr.com.huseyinaydin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//بسم الله الرحمن الرحيم

/**
 *
 * @author Huseyin_Aydin
 * @since 1994
 * @category Java, Spring Boot, DevOps.
 *
 */

@SpringBootApplication
@RestController
public class SpringBootDevOpsIntegrationApplication {

    @GetMapping("/selam")
    public String selamlar(){
        return "Selamun aleyküm...";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDevOpsIntegrationApplication.class, args);
    }

}
