package project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.dao.StudentDAO;
import project.module.Student;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentDAO studentDAO;

    @Transactional
    public void addGroup(Student student){
        studentDAO.saveAndFlush(student);
    }

    @Transactional
    public List<Student> findAll(){
        return studentDAO.findAll();
    }
}
