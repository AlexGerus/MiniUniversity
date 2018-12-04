package project.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import project.module.Group;

import java.util.List;

@Repository
@Transactional
public interface GroupDAO extends JpaRepository<Group, Long> {
    @Query("select group.nameGroup from Group group where group.idTeacher =: idTeacher")
    List<Group> getGroupByTeacherId(@Param("idTeacher") long idTeacher);

    @Query("select group.studentsSet from Group group where group.nameGroup =:nameGroup")
    List<Group> getGroupByGroupName(@Param("nameGroup") String nameGroup);
}
