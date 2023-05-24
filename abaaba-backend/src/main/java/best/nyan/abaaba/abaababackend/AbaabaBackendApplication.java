package best.nyan.abaaba.abaababackend;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("best.nyan.abaaba.abaababackend.entity.mapper")
public class AbaabaBackendApplication {

    public static final ObjectMapper globalObjMapper = new ObjectMapper();


    public static void main(String[] args) {
        SpringApplication.run(AbaabaBackendApplication.class, args);
    }

}
