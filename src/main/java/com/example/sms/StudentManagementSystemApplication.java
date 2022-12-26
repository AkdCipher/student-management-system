package com.example.sms;

import com.example.sms.entity.Student;
import com.example.sms.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementSystemApplication.class, args);
    }

    @Autowired
    private StudentRepository studentRepository;
    @Override
    public void run(String... args) throws Exception {

//        Student student1=new Student("Anmol","Kalra","ak12@gmail.com");
//        studentRepository.save(student1);
//        Student student2=new Student("Anant","Kumar","akumar12@gmail.com");
//        studentRepository.save(student2);
//        Student student3=new Student("Ishika","Singh","ishsingh@gmail.com");
//        studentRepository.save(student3);
    }
}
