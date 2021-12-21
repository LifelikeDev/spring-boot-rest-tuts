package further;

import com.example.learn.LearnApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FurtherLearn {

    public static void main(String[] args) {
        SpringApplication.run(com.example.learn.LearnApplication.class, args);
        System.out.println("NEW SPRING BOOT APP ON PORT 8080...");

        Student studentOne = new Student();
        studentOne.setFirstName("Jones");
        studentOne.setLastName("Turkson");
        studentOne.setId(12234545L);
       System.out.println(studentOne);
    }

}

