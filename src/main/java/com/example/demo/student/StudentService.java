package com.example.demo.student;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;




    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public void addNewStudent(Student student) {
//     Optional<Student> studentOptional= studentRepository
//                .findStudentByEmail(student.getEmail());
//        if(studentOptional.isPresent()) {
//            throw new IllegalAccessException("email taken");
//        }
        studentRepository.save(student);

    }

    public void deleteStudent(Long studentId){

      studentRepository.deleteById(studentId);
      }

    }

