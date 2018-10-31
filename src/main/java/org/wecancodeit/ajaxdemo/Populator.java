package org.wecancodeit.ajaxdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import org.wecancodeit.ajaxdemo.models.Student;
import org.wecancodeit.ajaxdemo.repositories.StudentRepository;

@Service
public class Populator implements CommandLineRunner {
	
	@Autowired
	StudentRepository studentRepo;

	@Override
	public void run(String... args) throws Exception {
		studentRepo.save(new Student("Ingrid", "Java"));
		studentRepo.save(new Student("Jane", "CSS"));
		studentRepo.save(new Student("Kelli", "C++"));
		studentRepo.save(new Student("Alex", "JavaScript"));
		studentRepo.save(new Student("Riley", "Java"));
	}

}
