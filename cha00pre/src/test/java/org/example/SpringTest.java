package org.example;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.vo.Cat;
import org.vo.Student;
import org.vo.Tiger;

public class SpringTest {
    @Test
    public void createBean01() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        Student myStudent = (Student) ac.getBean("myStudent");
        System.out.println(myStudent);
    }
    @Test
    public void createBean02() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        Student stu = (Student) ac.getBean("createStudent");
        System.out.println(stu);
    }

    @Test
    public void createBean03() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        Cat myCat = (Cat) ac.getBean("myCat");
        System.out.println(myCat);
    }

    @Test
    public void createBean04() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        Tiger myTiger = (Tiger) ac.getBean("myTiger");
        System.out.println(myTiger);
    }
}
