package edu.usach.studentspring.controller;

import edu.usach.studentspring.model.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface StudentController extends CrudRepository<Student, Long> {
}
