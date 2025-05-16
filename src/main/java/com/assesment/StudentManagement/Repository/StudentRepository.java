package com.assesment.StudentManagement.Repository;

import com.assesment.StudentManagement.Entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {

}
