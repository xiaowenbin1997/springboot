package org.example;

import org.springframework.context.annotation.*;
import org.vo.Student;

@Configuration
@ImportResource(value = "classpath:springCat.xml")
@ComponentScan(value = "org.vo")
@PropertySource(value = "classpath:tiger.properties")
public class SpringConfig {

    @Bean
    public Student createStudent() {
        Student student = new Student();
        student.setName("拉拉");
        student.setAge(22);
        student.setSex("男");
        return student;
    }
}
