package project.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import project.module.Teacher;

import java.util.List;

@Repository
@Transactional
public interface TeacherDAO extends JpaRepository<Teacher, Long> {
    @Query("select teacher.studentSet from Teacher teacher where teacher.nameTeacher =: nameTeacher")
    List<Teacher> listTeacherByName(@Param("nameTeacher") String nameTeacher);
}
