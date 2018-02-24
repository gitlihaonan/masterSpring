package masterspring;

import masterspring.confing.PicturesUploadProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({PicturesUploadProperties.class})
public class MasterspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(MasterspringApplication.class, args);
	}
}
