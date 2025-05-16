package com.assesment.StudentManagement.Controller;

import com.assesment.StudentManagement.Entities.Student;
import com.assesment.StudentManagement.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping
    public ResponseEntity<List<Student>> getAll(){
        List<Student> students = service.getAll();
        return ResponseEntity.ok(students);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getbyId(@PathVariable Long id){
        Student student = service.getById(id);
        return ResponseEntity.ok(student);
    }

    @PostMapping
    public ResponseEntity<Student> create(@RequestBody Student student){
        Student savedStudent = service.save(student);
        return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Student> update(@PathVariable Long id, @RequestBody Student student) {
        Student updated = service.update(id, student);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.ok("Student with ID " + id + " deleted successfully.");
    }

}
