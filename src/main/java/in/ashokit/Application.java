package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.StudentEntity;
import in.ashokit.repository.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		StudentRepository studentRepo = context.getBean(StudentRepository.class);
		System.out.println(studentRepo.getClass().getName());
		StudentEntity stu1 = new StudentEntity(103,"NATTU","nattu@gami",13);
		studentRepo.save(stu1);
		System.out.println("Record Inserted");
	}

}
