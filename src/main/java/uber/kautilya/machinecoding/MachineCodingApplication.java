package uber.kautilya.machinecoding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import uber.kautilya.machinecoding.models.BaseModel;

@SpringBootApplication
@EnableJpaAuditing
public class MachineCodingApplication {

    public static void main(String[] args) {
        BaseModel baseModel = new BaseModel();
        baseModel.setId(101);
        SpringApplication.run(MachineCodingApplication.class, args);
    }

}
