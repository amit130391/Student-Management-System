package com.assesment.StudentManagement.Service;

import com.assesment.StudentManagement.Entities.Student;
import com.assesment.StudentManagement.Exception.StudentNotFoundException;
import com.assesment.StudentManagement.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAll(){
       return studentRepository.findAll();
    }

    public Student getById(Long id){
        return studentRepository.findById(id).orElseThrow(()-> new StudentNotFoundException(id));
    }

    public Student save(Student student){
        return studentRepository.save(student);
    }

    public Student update(Long id,Student student){
        Student existing = studentRepository.findById(id).orElseThrow(()->new StudentNotFoundException(id));
        existing.setFirstName(student.getFirstName());
        existing.setLastName(student.getLastName());
        existing.setEmail(student.getEmail());
        existing.setCourse(student.getCourse());
        return studentRepository.save(existing);
    }

    public void delete(Long id){
        if(!studentRepository.existsById(id))
            throw new StudentNotFoundException(id);
        studentRepository.deleteById(id);
    }

}
