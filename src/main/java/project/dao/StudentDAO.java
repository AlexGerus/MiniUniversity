package project.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import project.module.Student;

@Repository
@Transactional
public interface StudentDAO extends JpaRepository<Student, Long> {

}
