package org.wecancodeit.ajaxdemo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.ajaxdemo.models.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
